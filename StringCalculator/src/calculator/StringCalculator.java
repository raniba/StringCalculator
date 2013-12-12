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
			{
				sum+=stToInt(numbers[i]);
				if(stToInt(numbers[i]) <0)
					negative_numbers += numbers[i] + " ,";
			}
				
		}//for
		return sum;
	}
	
	private String negative_numbers="";//saves the negative numbers
	
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
		 {
			 if(stToInt(string)<0)
			 {
				 negative_numbers = string;
				 throw new Exception("negatives not allowed: " + negative_numbers);
			 }
			 else
			 {
				 return stToInt(string);
			 }
			 
		 }//if(numbers.length == 1)
		 
		int sum= sumNumbers(numbers);
		if(negative_numbers.equals(""))
			return sum;
		else
			 throw new Exception("negatives not allowed: " + negative_numbers);
			
	}

}
