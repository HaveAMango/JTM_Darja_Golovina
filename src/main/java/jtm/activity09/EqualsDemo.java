package jtm.activity09;

public class EqualsDemo {
	
	public static void main(String[] args) {
		// ==
		// equals
		
		Person p1 = new Person("John");
		Person p2 = new Person("John");
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1 == p1);
		System.out.println(p1.equals(p1));
	}
}

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
