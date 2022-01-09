package Assignments;
import java.util.Scanner;
public class mst {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n2=n;
		int count=0;
		while(n!=0) {
			n=n/2;
			count++;
		}
		int value=(int)Math.pow(2,count-1);
		if((n2 & value)==value) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
