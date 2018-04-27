package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.CircularCounter;

class CircularCounterTest 
{

	@Test
	void testIncrease_valueExceedItsLimit()
	{
		CircularCounter counter = new CircularCounter(1);
		counter.increase(); counter.increase();
		counter.increase();
		Integer actual = counter.getCounter(); 
		Integer expected = 0;
		assertEquals(expected, actual);
	}

}
