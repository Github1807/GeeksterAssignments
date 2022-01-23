package Assignmnets;
import java.util.*;

public class Rotate3*3MatrixClockwise {
    public static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=3;
        int N=3;
        int arr[][]=new int[M][N];
        System.out.println("start filling the 2d array");
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i< arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<M;i++){
            reverse(arr[i]);
        }
        System.out.println("2d array is");
        for(int i=0;i<M;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
