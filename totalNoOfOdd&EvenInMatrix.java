package Assignments;

import java.util.Scanner;

public class totalNoOfOdd&EvenInMatrix {
    public static int odd(int mat[][]){
        int odd=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]%2!=0){
                    odd++;
                }
            }
        }
        return odd;
    }
    public static int even(int mat[][]){
        int even=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]%2==0){
                    even++;
                }
            }
        }
        return even;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("row size of first matrix");
        int m1= sc.nextInt();
        System.out.println("column size of first matrix");
        int n1= sc.nextInt();
        int arr[][]=new int[m1][n1];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                arr[i][j]= sc.nextInt();

            }
        }
        System.out.println("total number of odds in matrix "+odd(arr));
        System.out.println("total number of evens in matrix "+even(arr));
    }
}
