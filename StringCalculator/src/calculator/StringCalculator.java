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
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			sum+=stToInt(numbers[i]);
		}
		return sum;
	}

}
