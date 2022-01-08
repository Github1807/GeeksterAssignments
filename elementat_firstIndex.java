package Assignments;
import java.util.Scanner;

public class elementAt_firstIndex {
	public static int firstIndex(int arr[] , int n) {
		int pos=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				pos=i;
				break;
		}
	}
		return pos;
	}
			
	public static void main(String args[]) {
		int num[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		for(int j=0;j<10;j++) {
			num[j]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
	    int n=sc.nextInt();
		System.out.println(firstIndex(num, n));
	}
}
