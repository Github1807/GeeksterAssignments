package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayUpperTriangularMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int M= sc.nextInt();
        int N= sc.nextInt();
        if(M!=N){
            System.out.println("can't convert a non square matrix ");
            System.out.println("enter the size of array again");
            M= sc.nextInt();
            N= sc.nextInt();
        }
        int arr[][]=new int[M][N];
        System.out.println("start filling the array");
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(i>j){
                    arr[i][j]=0;
                }
            }
        }
        System.out.println("upper triangular matrix is  ");
        for(int i=0;i<M;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
