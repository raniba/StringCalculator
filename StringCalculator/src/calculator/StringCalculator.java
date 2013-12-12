//raniba
package calculator;

public class StringCalculator {
	private int stToInt(String string)//convert String to int
	{
		return Integer.parseInt(string);
	}
	
	private int sumNumbers(String[] numbers)//sum the numbers
	{
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			sum+=stToInt(numbers[i]);
		}
		return sum;
	}
	
	public int Add(String string)
	{
		if(string.isEmpty())
			return 0;
		String[] numbers = string.split("[,\n]");
		 if(numbers.length == 1)
			 return stToInt(string);
		return sumNumbers(numbers);
	}

}
