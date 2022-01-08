package Assignments;
import java.util.Scanner;

public class positiveNo_inArray {
	public static void positiveNo(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.print(arr[i]+" ");
			}else {
				continue;
			}
		}
	}
			
		
	public static void main(String args[]) {
		int number[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			number[i]=sc.nextInt();
		}
		positiveNo(number);
	}
}
