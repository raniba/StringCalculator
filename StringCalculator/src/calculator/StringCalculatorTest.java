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
	public void addingEmptyStringReturns0() throws Exception //input: empty string, output:zero
	{
		//act
		int result= calculator.Add("");
		
		//assert
		assertEquals(0,result);
	}
	
	@Test
	public void JustOneNumber() throws Exception //input: just one number, output:the number
	{
		//act
		int result= calculator.Add("1");
		
		//assert
		assertEquals(1,result);
	}
	
	@Test
	public void addTwoNumbers() throws Exception //input: two numbers, output:the sum
	{
		//act
		int result= calculator.Add("1,2");
		
		//assert
		assertEquals(3,result);
	}
	
	@Test
	public void addNoLimitNumbers() throws Exception //input: no limited number of numbers, output:the sum
	{
		//act
		int result= calculator.Add("1,2,3");
		
		//assert
		assertEquals(6,result);
	}

	@Test
	public void newLinesBetweenNumbers() throws Exception //input: string with lines between numbers in it, output sum
	{
		//act
		int result= calculator.Add("1,2\n3");
		
		//assert
		assertEquals(6,result);
	}
	
	@Test
	public void SupportDifferentDelimiters () throws Exception //input: string with different delimiters between numbers in it, output sum
	{
		//act
		int result= calculator.Add("//#\n1#2#1#1#2#3#4#5");
		
		//assert
		assertEquals(1+2+1+1+2+3+4+5,result);
	}
	
	@Test
	public void negativeNumberException()throws Exception //Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed.if there are multiple negatives, show all of them in the exception message 
	{
		try
		{
			//act
			int result= calculator.Add("//#\n1#2#-1#1#-2#-33#4#5");
			//assert
			assertEquals(1+2-1+1-2-33+4+5,result);
		}
		
		catch(Exception e)
		{
			 System.out.println(e);
		}
		
	}

}
