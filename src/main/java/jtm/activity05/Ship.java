package jtm.activity05;

import jtm.activity04.Transport;

public class Ship extends Transport {

	
		// TODO Auto-generated constructor stub
	
	

	protected byte numberOfShips;

		public Ship(String id, float consumption, int tankSize, byte numberOfShips) {
			super(id, 0, 0);
			this.numberOfShips = numberOfShips;
		}

		@Override
		public String move(Road road) {
			// TODO Auto-generated method stub
			return super.move(road);
		}

//		Override move(Road) to return String in form:
//			ID Ship is sailing on (Road as String) with x sails
	

}
