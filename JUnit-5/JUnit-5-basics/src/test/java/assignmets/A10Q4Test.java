package assignmets;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class A10Q4Test {
	A10Q4 a10q4;
	@BeforeAll
	 static void BefAll()
	{
		System.out.println("Operation started");
	}
	@AfterAll
	static void AfteAll()
	{
		System.out.println("Operation ended");
	}
	@BeforeEach
	void init()
	{a10q4=new A10Q4();
		
	}

	@AfterEach
	void after()
	{
		System.out.println("operation completed");
	}
		@Test
		void sum() {
			int expected=2;
			assertEquals(expected,a10q4.add(1, 1) );
		}
		@Test
		void sub() {
			int expected=2;
			assertEquals(expected,a10q4.sub(3, 1) );
		}
		@Test
		void mul() {
			int expected=4;
			assertEquals(expected,a10q4.mul(2, 2) );
		}
		@Test
		void div() {
			int expected=3;
			assertEquals(expected,a10q4.div(6, 2));
		}

	}


