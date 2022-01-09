package Assignments;
import java.util.Scanner;

public class addOneIn_Number {
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int count=0;
    	int m=1;
    	while((n&m)!=0) {
    		m=m<<1;
    		count++;
    	}
    	for(int i=0;i<=count;i++) {
    		int value=(int)(Math.pow(2, i));
           n=n^value;
           }
    	System.out.println(n);
    }
}
