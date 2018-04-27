package app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RankTest {

	@Test
	void testReset_any() 
	{
		Rank favoriteNumber = new Rank(10.0,2.0);
		Double actual = favoriteNumber.reset();
		Double expected = 0.0;
		assertEquals(expected, actual );
	}

}
