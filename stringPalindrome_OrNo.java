package Assignments;
import java.util.Arrays;
import java.util.Scanner;

public class stringPalindrome_OrNot {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be converted in char array & to be checked if it is palindrome or not");
		System.out.println("Assumin upper & Lower case");
		String a=sc.nextLine();
		char arr[]=a.toCharArray();
		System.out.println(Arrays.toString(arr));
		boolean flag= true;
		for(int i = 0, j = arr.length-1; i<j; i++, j--) {
			if(arr[i] != arr[j]) {
				flag=false;
				break;
			}
		}
		System.out.println("ans for array is"+flag);
		
}
}
