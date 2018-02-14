
public class RomanToInteger {
	public static void main(String[] args)
	{
		System.out.println(RomanToInt("CCXLVI"));
	}
	
	static int RomanToInt(String s) {
		int num = 0;
		char roman[] = s.toCharArray();
		if(s.indexOf("IV")!=-1)
			num -= 2;
		if(s.indexOf("IX")!=-1)
			num -= 2;
		if(s.indexOf("XL")!=-1)
			num -= 20;
		if(s.indexOf("XC")!=-1)
			num -= 20;
		if(s.indexOf("CD")!=-1)
			num -= 200;
		if(s.indexOf("CM")!=-1)
			num -= 200;
		for(int i=0; i<s.length(); i++) {
			switch(roman[i]) {
				case 'M': num+=1000;break;
				case 'D': num+=500;break;
				case 'C': num+=100;break;
				case 'L': num+=50;break;
				case 'X': num+=10;break;
				case 'V': num+=5;break;
				case 'I': num+=1;
			}
		}
		return num;
	}
}
