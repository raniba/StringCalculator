//raniba
package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void addingEmptyStringReturns0() //input: empty string, output:zero
	{
		//arrange
		StringCalculator calculator = new StringCalculator();
	
		//act
		int result= calculator.Add("");
		
		//assert
		assertEquals(0,result);
	}
	
	@Test
	public void JustOneNumber() //input: just one number, output:the number
	{
		//arrange
		StringCalculator calculator = new StringCalculator();
	
		//act
		int result= calculator.Add("1");
		
		//assert
		assertEquals(1,result);
	}

}
