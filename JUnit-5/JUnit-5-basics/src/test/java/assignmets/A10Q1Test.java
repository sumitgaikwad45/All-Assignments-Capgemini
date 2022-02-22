package assignmets;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class A10Q1Test {
	A10Q1 a10q1;
	@BeforeEach
	void init() {
		a10q1 = new A10Q1();
	}
	@Test
	void minMaxFindertest() {
	
		int arr[]={56, 34, 7, 3, 54, 3, 34, 34, 53};
		int expected [] = {3,56};
		assertArrayEquals(expected, a10q1.findMinMax(arr));
		
	}
	
	@Test
	void minMaxFindertest1() {
	
		int arr[]={56, 34, 7, 0, 54, 3, 34, 34, 53};
		int expected [] = {0,56};
		assertArrayEquals(expected, a10q1.findMinMax(arr));
		
	}
	@Test
	void minMaxFindertest2() {
	
		int arr[]={-56, -34, -7, -3, -54, -3, -34, -34, -53};
		int expected [] = {-56,-3};
		assertArrayEquals(expected, a10q1.findMinMax(arr));
		
	}

}
