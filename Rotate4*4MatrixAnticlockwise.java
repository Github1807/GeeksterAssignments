package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate4*4MatrixAnticlockwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=4;
        int N=4;
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
        for (int j=0;j<N;j++){
            int i=0;
            int last=M-1;
            while(i<=last){
                int temp=arr[i][j];
                arr[i][j]=arr[last][j];
                arr[last][j]=temp;
                last--;
                i++;
            }

        }
        System.out.println("2d array is");
        for(int i=0;i<M;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
