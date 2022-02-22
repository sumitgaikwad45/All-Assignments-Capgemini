package assignmets;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class A10Q2Test {
	A10Q2 a10q2;
	@BeforeEach
	void init() {
		a10q2 = new A10Q2();
	}
	
	@Test
	void MinMaxFindertest() {
		int arr[]={56, 34, 7, 3, 54, 3, 34, 34, 53};
		String expected  = "[3, 56]";
		assertEquals(expected, a10q2.findMinMax(arr));
		
		
	}

	 

}
