package Assignments;
import java.util.Arrays;
public class swapping_Numbers {
   public static int[] swap(int arr[],int i1,int i2) {
	   try {
		   int temp=arr[i1];
		   arr[i1]=arr[i2];
		   arr[i2]=temp;
	   }
	   catch(Exception e) {
		   System.out.println("cannot swap indices since they are out of bounds");
	   }return arr;
   }
   public static void main(String args[]) {
	   int arr[]= {45,62,78,92,45,30,73};
	   System.out.println(Arrays.toString(swap(arr,62,78)));
   }
}
