
public class SwapTwoNumbersWithoutTemp {
	public static void swapNumbers(int a, int b) {
		System.out.println("Before: "+a+", "+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("after: "+a+", "+b);
	}
	
	public static void main(String[] args) {
		swapNumbers(1, 45);
	}
}
