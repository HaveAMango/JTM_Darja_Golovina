package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Ship extends Transport {

	
		// TODO Auto-generated constructor stub
	
	

	protected byte numberOfSails;

		public Ship(String id, byte numberOfSails) {
			super(id, 0, 0);
			this.numberOfSails = numberOfSails;
		}

		@Override
		public String move(Road road) {
			// TODO Auto-generated method stub
			return super.move(road);
		}

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
