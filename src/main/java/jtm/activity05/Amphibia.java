package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Amphibia extends Transport {

	public Amphibia(String id, float consumption, int tankSize, byte sails, int wheels) {
		super(id, consumption, tankSize);
		this.sails = sails;
		this.ship = new Ship(id, sails);
		this.vehicle = new Vehicle(id, consumption, tankSize, wheels);
	}

	private Ship ship;
	private byte sails;
	private int wheels;
	private Vehicle vehicle;

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public byte getSails() {
		return sails;
	}

	public void setSails(byte sails) {
		this.sails = sails;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public String move(Road road) {
		if (road instanceof WaterRoad) {
			return ship.move(road).replaceFirst("Ship", "Amphibia");

			} else {
				super.move(road);
				return vehicle.move(road).replaceFirst("Vehicle", "Amphibia");
			}

		}
	}


//Implement Amphibia class in a such way, that it is a Transport:
//Make all internal properties of Amphibia private.
//Implement constructor Amphibia(String id, float consumption, int tankSize, byte sails, int wheels)
//Override move(Road road) method, that Amhibia behaves like a Vehicle on ground road and like a Ship on water road.