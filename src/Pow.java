
public class Pow {
	public static double myPow(double x, int n) {
		if(x == 0) return 1;
		if(n < 0) {
			x = 1/x;
			n *= -1;
		}
		double ret = 1.0;
		while(n-- > 0) {
			ret = ret * x;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		System.out.println(myPow(2, -2147483648));
	}
}