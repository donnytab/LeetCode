
public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        boolean signed = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);
        int quotient = 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while(dividend >= divisor) {
        	quotient++;
        	dividend -= divisor;
        }
        quotient = signed?-quotient:quotient;
        return quotient;
    }
    
    // Sample Solution
    public int divide(int dividend, int divisor) {
		if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        if(dividend > 0 && divisor > 0) return divideHelper(-dividend, -divisor);
        else if(dividend > 0) return -divideHelper(-dividend,divisor);
        else if(divisor > 0) return -divideHelper(dividend,-divisor);
        else return divideHelper(dividend, divisor);
    }
    
    private int divideHelper(int dividend, int divisor){
        // base case
        if(divisor < dividend) return 0;
        // get highest digit of divisor
        int cur = 0, res = 0;
        while((divisor << cur) >= dividend && divisor << cur < 0 && cur < 31) cur++;
        res = dividend - (divisor << cur-1);
        if(res > divisor) return 1 << cur-1;
        return (1 << cur-1)+divide(res, divisor);
    }
    
    public static void main(String[] args) {
    	System.out.println(divide(Integer.MIN_VALUE, -1));
    }
}
