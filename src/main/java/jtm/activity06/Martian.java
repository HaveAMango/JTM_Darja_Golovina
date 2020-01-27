package jtm.activity06;

public class Martian implements Alien, Humanoid, Cloneable {
int armCount;
int weight;
int legCount;
boolean alive;


	public Martian(int weight) {
	super();
	this.weight = 42;
	this.alive = true;
	this.legCount = 7;
}

	@Override
	public String killHimself() {
		if (this.legCount == 7) {
			return "I AM IMMORTAL!";
		}else
			alive = false;
		return "Dead";
	
	}

	@Override
	public int getArmCount() {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public String[] getBackpack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addToBackpack(String item) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

	}

	@Override
	public int getLegCount() {
		// TODO Auto-generated method stub
		return legCount;
	}

	@Override
	public String isAlive() {
		// TODO Auto-generated method stub
		return null;
	}

}
