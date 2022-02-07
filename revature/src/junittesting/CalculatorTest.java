package junittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		
		Calculator calc = new Calculator();
		int aOutput= calc.add(5, 5);
		
		int eOutput = 10;
		
		assertEquals(eOutput, aOutput);
		
	}
	
	@Test
	public void testMultiply() {
		
		Calculator calc = new Calculator();
		int aOutput= calc.multiply(5, 5);
		
		int eOutput = 25;
		
		assertEquals(eOutput, aOutput);
	}
}

