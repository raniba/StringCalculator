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
			if(!numbers[i].equals(""))
				sum+=stToInt(numbers[i]);
		}
		return sum;
	}
	
	public int Add(String string)throws Exception
	{
		if(string.isEmpty())
			return 0;
		String[] numbers;
		if(string.charAt(0) == '/' && string.charAt(1) == '/' && string.charAt(3) == '\n')
		{
			char delimiter = string.charAt(2);
			numbers = string.split("[//"+delimiter+",\n]");
		}
		else
		{
			numbers = string.split("[,\n]");
		}
		
		 if(numbers.length == 1)
			 return stToInt(string);
		return sumNumbers(numbers);
	}

}
