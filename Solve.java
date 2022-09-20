package Vi_Du;

public class Solve {
	public static int solve(int n) {
		if(n==0) return 0;
		if(n%10%2==0) {
			return n%10 + solve(n/10);
		}
		else {
			return solve(n/10);
		}
	}
	public static int findSumFibonacci(int n) {
		if(n<2) return 1;
		int a =findSumFibonacci(n-1);
		int b =findSumFibonacci(n-2);
	return a+b;
	}
	public static void main(String [] args) {
		int n = 1234;
		//System.out.println(solve(n));
		//1 1 2 3 5 8 13 21 34 55 89
		System.out.println(findSumFibonacci(10));
	}
}
