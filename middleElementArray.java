package Assignments;
import java.util.Scanner;

public class middleArrayElement {
	public static int middleElement(int arr[]) {
		int middleElement=(arr.length/2)+1;
		int middleNo=0;
		for(int i=0;i<middleElement;i++) {
			middleNo=arr[i];
			}
		return middleNo;
		}
	public static void main(String args[]) {
		int number[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			number[i]=sc.nextInt();
		}
		System.out.println(middleElement(number));
		
		
	}
