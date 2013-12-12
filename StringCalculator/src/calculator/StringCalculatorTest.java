//raniba
package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	//arrange
			StringCalculator calculator = new StringCalculator();
	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void addingEmptyStringReturns0() //input: empty string, output:zero
	{
		//act
		int result= calculator.Add("");
		
		//assert
		assertEquals(0,result);
	}
	
	@Test
	public void JustOneNumber() //input: just one number, output:the number
	{
		//act
		int result= calculator.Add("1");
		
		//assert
		assertEquals(1,result);
	}
	
	@Test
	public void addTwoNumbers() //input: two numbers, output:the sum
	{
		//act
		int result= calculator.Add("1,2");
		
		//assert
		assertEquals(3,result);
	}
	
	@Test
	public void addNoLimitNumbers() //input: no limited number of numbers, output:the sum
	{
		//act
		int result= calculator.Add("1,2,3");
		
		//assert
		assertEquals(6,result);
	}

}
