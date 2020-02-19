package jtm.activity11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import jtm.activity08.SimpleCalc;

public class SimpleCalcTest {

	/*
	 * TODO
	 *
	 * Write unit tests. Try to cover as many cases as possible, to have the highest
	 * coverage for SimpleCalc class in jtm.activity08
	 */

	SimpleCalc sc;

	@Before
	public void setUp() {
		// TODO initialize SimpleCalc object
	}

	@Test
	public void testAddInRange() {
	assertEquals(Integer.valueOf(9),(SimpleCalc.add(7,2)));	
		// TODO test addition for case where both numbers and result is in allowed range
	}

	@Test
	public void testAddOutOfRange() {
		assertEquals(null,(SimpleCalc.add(12,2)));
		assertEquals(null,(SimpleCalc.add(2,13)));
		assertEquals(null,(SimpleCalc.add(8,8)));
		
		// TODO test addition for cases where both numbers and result is out of allowed
		// range
	}

	@Test
	public void testSubtractInRange() {
		assertEquals(Integer.valueOf(5),(SimpleCalc.subtract(7,2)));
		// TODO
	}

	@Test
	public void testSubtractOutOfRange() {
			assertEquals(null,(SimpleCalc.subtract(12,2)));
			assertEquals(null,(SimpleCalc.subtract(2,13)));
			
		// TODO
	}

	@Test
	public void testMultiplyInRange() {
		assertEquals(Integer.valueOf(8),(SimpleCalc.multiply(4,2)));
		// TODO
	}

	@Test
	public void testMultiplyOutOfRange() {
		assertEquals(null,(SimpleCalc.multiply(12,2)));
		assertEquals(null,(SimpleCalc.multiply(2,13)));
		assertEquals(null,(SimpleCalc.multiply(8,8)));
		// TODO
	}

	@Test
	public void testDivideInRange() {
		assertEquals(Integer.valueOf(3),(SimpleCalc.divide(6,2)));
		// TODO
	}

	@Test
	public void testDivideOutOfRange() {
		assertEquals(null,(SimpleCalc.divide(12,2)));
		assertEquals(null,(SimpleCalc.divide(2,16)));
		// TODO
	}

}
