package jtm.activity06;

public class Human implements Humanoid {
	private int weight;
	private boolean alive;
	private String[] backpack;
	

	public Human() {
		this(42);
	}

	public Human(int weight) {
		this.weight = weight;
		this.alive = true;
		this.backpack = new String[10];
	}

	public void setAlive(boolean isAlive) {
		this.alive = alive;
	}
	public boolean getAlive() {
		// TODO Auto-generated method stub
		return alive;
	}
	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

	@Override
	public void setWeight(int weight) {
			this.weight = weight;

	}

	@Override
	public String killHimself() {

		if (this.alive) {
			this.alive = false; 
			return "Dead";
		} else {
			return "Dead";
		}
	}

	@Override
	public int getArmCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String[] getBackpack() {
		// TODO Auto-generated method stub
		return this.backpack;
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
	
	// TODO Auto-generated method stub

	

	public void setBackpack(String[] backpack) {
		this.backpack = backpack;
	}

	@Override
	public String isAlive() {
		if (this.alive) {
			return "Alive";
		} else {
			return "Dead";
		}
//		return "Humanoid in form " + getWeight() + " " + getBackpack();
//		value of Humanoid in form "Type weight [Backpack]", e.g.
//	     * "Humanoid 7 [Backpack content]"
//	     */

	}

}
