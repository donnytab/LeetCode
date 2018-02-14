public class IntegerToRoman {
	public static void main(String[] args)
	{
		System.out.println(IntToRoman(2014));
	}
	
	static String IntToRoman(int num)
	{
		if(num<1 || num>3999) {
			return "";
		}
		else
			return RomanChar(num/1000,"","","M") + RomanChar((num%1000)/100,"M","D","C") 
					+ RomanChar(((num%1000)%100)/10,"C","L","X") + RomanChar(((num%1000)%100)%10,"X","V","I");
	}
	
	static String RomanChar(int digit, String upper, String mid, String lower) 
	{
		switch(digit) 
		{
			case 1:
				return lower;
			case 2:
				return lower+lower;
			case 3:
				return lower+lower+lower;
			case 4:
				return lower+mid;
			case 5:
				return mid;
			case 6:
				return mid+lower;
			case 7:
				return mid+lower+lower;
			case 8:
				return mid+lower+lower+lower;
			case 9:
				return lower+upper;
			default:
				return "";
		}
	}
}
