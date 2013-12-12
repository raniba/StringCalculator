//raniba
package calculator;

public class StringCalculator {
	public int Add(String string)
	{
		if(string.isEmpty())
			return 0;
		String[] numbers = string.split(",");
		 if(numbers.length == 1)
			 return Integer.parseInt(string);
		return Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
	}

}
