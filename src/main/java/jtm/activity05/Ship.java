package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Ship extends Transport {

	
		// TODO Auto-generated constructor stub
	
	

<<<<<<< HEAD
	protected byte sails;

		public Ship(String id, byte sails) {
			super(id, 0, 0);
			this.sails = sails;
=======
	protected byte numberOfSails;

		public Ship(String id, byte numberOfSails) {
			super(id, 0, 0);
			this.numberOfSails = numberOfSails;
>>>>>>> 72bf17c0c7217dc1b1cdb68f561b0b6b65b5219b
		}

		@Override
		public String move(Road road) {
			if (road instanceof WaterRoad) {
				return this.getId() + " Ship is sailing on "+ road.toString() + " with "+sails +" sails";
			}else {
				return "Cannot sail on "+ road.toString();
			}
			
		}
		

<<<<<<< HEAD
//		Override move(Road) to return String in form:
//			ID Ship is sailing on (Road as String) with x sails
//
//			where:
//
//			(Road as String) is string representation of the road (without brackets),
//			x is actual number of sails.
//			Note that fuel is not used when ship is moving, because it uses wind for sailing instead.
//			return Cannot sail on (Road as String) if it is not WaterRoad.
=======
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


>>>>>>> 72bf17c0c7217dc1b1cdb68f561b0b6b65b5219b
}
