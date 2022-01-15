package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class differenceOfTheTwoMatrix {
    public static int [][] diff(int arr1[][],int arr2[][]){
        int ans[][]=new int[arr1.length][arr1[0].length];
        if(arr1.length==arr2.length && arr1[0].length==arr2[0].length) {
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[0].length; j++) {
                    ans[i][j] = arr1[i][j] - arr2[i][j];
                }
            }
        }
        else{
            System.out.println("wrong input is given");
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("row size of first matrix");
        int m1= sc.nextInt();
        System.out.println("column size of first matrix");
        int n1= sc.nextInt();
        int arr[][]=new int[m1][n1];
        System.out.println("row size of second matrix");
        int m2= sc.nextInt();
        System.out.println("column size of second matrix");
        int n2= sc.nextInt();
        int arr2[][]=new int[m2][n2];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                arr[i][j]= sc.nextInt();

            }
        }
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        if(arr.length==arr2.length && arr[0].length==arr2[0].length){
            for(int i=0;i<arr.length;i++){
                System.out.println(Arrays.toString(diff(arr,arr2)[i]));
            }
        }
        else{
            System.out.println(diff(arr,arr2));
        }
    }
}
