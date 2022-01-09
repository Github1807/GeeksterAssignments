package Assignments;
import java.util.Scanner;
public class firstIndex {
    public static int elementAt_firstIndex(int arr[],int n) {
    	int index=-1;
    	for(int i=0; i<arr.length;i++) {
    		if(arr[i]==n) {
    			index=i;
    			break;
    		}
    		
    	}
    	return index;
    }
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the size of array");
    	int a=sc.nextInt();
    	int arr[]=new int[a];
    	System.out.println("Enter the values");
    	for(int j=0;j<a;j++) {
    		arr[j]=sc.nextInt();
    		}
    	System.out.println("Enter the no to be searched");
    	int n=sc.nextInt();
    	System.out.println(elementAt_firstIndex(arr,n));
    }
}
