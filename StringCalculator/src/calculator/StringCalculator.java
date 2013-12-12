//raniba
package calculator;

public class StringCalculator {
	public int Add(String string)
	{
		if(string.isEmpty())
			return 0;
		return Integer.parseInt(string);
	}

}
