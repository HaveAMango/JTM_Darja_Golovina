package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Ship extends Transport {

	public Ship(String id, byte sails) {
		super(id, 0, 0);
		this.sails = sails;
		// TODO Auto-generated constructor stub
	}

	private byte sails;

	public byte getSails() {
		return sails;
	}

	public void setSails(byte sails) {
		this.sails = sails;
	}

	@Override
	public String move(Road road) {
		if (road instanceof WaterRoad) {
			return this.getId() + " Ship is sailing on " + road + " with " + sails + " sails";
		} else {
			return "Cannot sail on " + road;
		}

	}

//		Override move(Road) to return String in form:
//			ID Ship is sailing on (Road as String) with x sails
//
//			where:
//
//			(Road as String) is string representation of the road (without brackets),
//			x is actual number of sails.
//			Note that fuel is not used when ship is moving, because it uses wind for sailing instead.
//			return Cannot sail on (Road as String) if it is not WaterRoad.

//		3.Override move(Road) to return String in form:
//			ID Ship is sailing on (Road as String) with x sails 
//
//			where:
//			◾(Road as String) is string representation of the road (without brackets),
//			◾x is actual number of sails.
//
//			Note that fuel is not used when ship is moving, because it uses wind for sailing instead. 
//
//			return Cannot sail on (Road as String) if it is not WaterRoad. 

}
