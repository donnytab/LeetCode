/*
 * The Sieve of Eratosthenes uses an extra O(n) memory 
 * and its runtime complexity is O(n log log n).
 */
public class CountPrimes {
	public static int countPrime(int n){
		boolean[] isPrime = new boolean[n];
		for(int i=2; i<n; i++) {
			isPrime[i] = true;
		}
		for(int j=2; j*j<n; j++) {
			if(!isPrime[j]) continue;
			for(int k=j*j; k<n; k=k+j) {
				isPrime[k] = false;
			}
		}
		int sum = 0;
		for(int i=2; i<n; i++) {
			if(isPrime[i]) sum++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(countPrime(10));
	}
}
