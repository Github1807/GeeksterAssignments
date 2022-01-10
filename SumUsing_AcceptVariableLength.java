package Assignments;

import java.util.Scanner;

public class sumUsing_AcceptVariableLength {
    public static int  sum_print(int a){
        int sum=0;
        for(int i=a;i>0;i--){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int length=0;
        while(n>0){
            n=n/10;
            length ++;
        }
        System.out.println(sum_print(length));
    }
}
