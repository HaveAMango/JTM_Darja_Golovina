package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Vehicle extends Transport {

	public Vehicle(String id, float consumption, int tankSize, int wheels) {
		super(id, consumption, tankSize);
		this.wheels = wheels;
	}

	protected int wheels;

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public String move(Road road) {
		if (road instanceof WaterRoad) {
			return "Cannot drive on " + road.toString();
		} else {
			return super.move(road).replace("moving", "driving") + " with "+ this.getWheels() + " wheels" ; 
		}

	}
}
//Create class Vehicle as subclass of Transport
//Allow to store protected int number of wheels for vehicle.
//Implement Vehicle(String id, float consumption, int tankSize, int wheels) constructor,
//Override method move(Road) for vehicle, which returns String in form:
//ID Vehicle is driving on (Road as String) with x wheels
//
//where:
//
//(Road as String) is string representation of the road,
//x is actual number of wheels.
//return Cannot drive on (Road as String) if it is not Road.


