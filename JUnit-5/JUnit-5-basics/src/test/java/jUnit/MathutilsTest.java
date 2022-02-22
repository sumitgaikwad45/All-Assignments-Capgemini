package jUnit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)      // to create instance per class 
@DisplayName("When running mathUtils")
class MathutilsTest {
 Mathutils mathUtils; 
 TestInfo testInfo;
 TestReporter testReporter;
 @BeforeAll                 // if you are making instance per class then there is noneed to write static keyword in before all method
/* static*/ void beforeAllInit() {
 System.out.print("This needs to run before all"); 
 }
 
 @BeforeEach
 void init() {
	 mathUtils = new Mathutils();
}
 
 @AfterEach
 void cleanup() {
 System.out.print("Cleaning up...");
 }
 
 @Nested
 @Tag("Math")
 @DisplayName("Add method")
 class AddTest{
	 @Test
	 @DisplayName("When adding two postitve numbers")
	 void testaddPositive() {	
	 assertEquals(2, mathUtils.add(1,1),"should returns right sum"); 
	}
	 
	 @Test
	 @DisplayName("When adding two negative numbers")
	 void testaddNegative() {
		 int expected = -2;
		 int actual = mathUtils.add(-1, -1);
	 assertEquals(expected,actual,()->"should returns sum" + expected + "but returned" + actual); 
	}	
 }
 
 
 @Test
 @Tag("Math")
 @DisplayName("multiply method")
 void testMultiply() {
	// assertEquals(4,mathUtils.multiply(2, 2), "Should return right product");
	 assertAll(      // instead of writing asserEquals for all test cases we can use assertAll and put all cases inside that. 
			 ()->assertEquals(4,mathUtils.multiply(2, 2)),
			 ()->assertEquals(0,mathUtils.multiply(2, 0)),
			 ()->assertEquals(-2,mathUtils.multiply(2,-1)) 
			 );
 }
	
	@Test
	//@EnabledOnOs(OS.LINUX)     // this test is only enabled on Linux OS so it is disabled for windows now
	@Tag("Math")
	void testDivide() {
		boolean isServerUp = false ;
		assumeTrue(isServerUp);         // in this case if isServerUp is true then and only then this test is going to run
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0),"divide by zero should throw");	
	}
	 
	
	@RepeatedTest(2)              // Repeats this test three times
	@Tag("Circle")
	void testCopmputeCircleArea() {
		
		assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"should return right circle area");
	}
	
	@Test
	@Disabled
	 @DisplayName("Test driven devolpoment... should not run ")
	void testDisable() {	
	 fail("This test should be disabled");
	}

}
