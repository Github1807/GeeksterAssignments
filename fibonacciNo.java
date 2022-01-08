package Assignments;
import java.util.Scanner;
public class fibonacciNo {
	public static int fibonacci(int n) {
		int fibo=0;
		if(n==0 || n==1) {
			return 1;
			}else {
				fibo=fibonacci(n-1)+fibonacci(n-2);
			}
		return fibo;
	}
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibonacci(n));
		
	}
	

}
