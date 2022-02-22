package assignmets;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class A10Q3Test {
	A10Q3 a10q3;
	@BeforeEach
     void init() {
		a10q3=new A10Q3();
	}
	@Test
	void test1() {
		assertThrows(InsufficientFundException.class,()->a10q3.withdraw(3000));
	}
	@Test
	void test2() {
		assertThrows(InsufficientFundException.class,()->a10q3.withdraw(5000));
	}
	@Test
	void test3() {
		assertThrows(InsufficientFundException.class,()->a10q3.withdraw(4000));
	}

}
