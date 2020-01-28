package jtm.activity06;

public class Martian implements Alien, Humanoid, Cloneable {

	int weight;
	boolean alive;
	private String[] backpack;

	public Martian() {
		this(42);
	}

	public Martian(int weight) {
		this.weight = weight;
		this.alive = true;
		this.backpack = new String[10];
	}

	@Override
	public String killHimself() {
		return isAlive();
	}

	@Override
	public int getArmCount() {
		// TODO Auto-generated method stub
		return ARM_COUNT;
	}

	@Override
	public String[] getBackpack() {
		// TODO Auto-generated method stub
		return backpack;
	}

	@Override
	public void addToBackpack(String item) {
		for (int i = 0; i < this.backpack.length; i++) {
			if (this.backpack[i] == null) {
				this.backpack[i] = item;
				break;
			}
		}

	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void setWeight(int weight) {
		this.weight = weight;
		// TODO Auto-generated method stub

	}

	@Override
	public void eatHuman(Humanoid humanoid) {
		if (humanoid.isAlive() == "Alive") {
			humanoid.killHimself();
			this.weight = this.weight + humanoid.getWeight();
		}
//		humanoid represents human, needed to be eaten. Human is being killed
//	     *                 when it is eaten an alien gains his weight

	}

	@Override
	public int getLegCount() {
		// TODO Auto-generated method stub
		return LEG_COUNT;
	}

	@Override
	public String isAlive() {
		// TODO Auto-generated method stub
		return "I AM IMMORTAL!";
	}

	protected Object clone() throws CloneNotSupportedException {
		Martian a = new Martian();
		a.alive = this.alive;
		a.backpack = this.backpack;
		a.weight = this.weight;
		return a;
	}

}
