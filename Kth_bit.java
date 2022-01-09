package Assignments;
import java.util.Scanner;
public class Kth_bit {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		System.out.println("Enter the no to be set 1");
		int bit=sc.nextInt();
		int value=(int)Math.pow(n, bit-1);
		n=n|value;
		System.out.println(n);
	}

}
