package Vi_Du;

public class Fibonacci {
	public static int findSumFibonacci(int n) {
		if(n==1 || n ==2) return 1;
		return findSumFibonacci(n -1) + findSumFibonacci(n-2);
	}
	public static void man(String [] args) {
		int n =0;
		int c = findSumFibonacci(n);
		System.err.println(c);
	}
}
