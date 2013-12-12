//raniba
package calculator;

public class StringCalculator {
	private int stToInt(String string)//convert String to int
	{
		return Integer.parseInt(string);
	}
	
	public int Add(String string)
	{
		if(string.isEmpty())
			return 0;
		String[] numbers = string.split(",");
		 if(numbers.length == 1)
			 return stToInt(string);
		return stToInt(numbers[0])+stToInt(numbers[1]);
	}

}
