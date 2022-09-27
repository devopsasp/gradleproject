package calculatorproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
Calculator obj;
	@BeforeEach
	public  void setObject()
	{
		obj=new Calculator();
	}
	@Test
	void testAdd() {
		
		int expected=20;
		int actual=obj.add(15,5);
		assertEquals(expected,actual);
		
	}

	@Test
	void testMultiply() {
		
		int expected=35;
		int actual=obj.multiply(7, 5);
		assertEquals(expected,actual);
		
	}

	@Test
	void testSubtract() {
		
		int expected=30;
		int actual=obj.subtract(50, 20);
		assertEquals(expected,actual);
	}

}
