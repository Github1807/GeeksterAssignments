package Assignments;

import java.util.Scanner;

public class SumOfFirst&lastDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int start_digit=n%10;
        int end_digit=0;
        while(n>0){
            start_digit=n%10;
            n=n/10;
        }
        System.out.println("end digit is "+ end_digit+ " start digit is "+ start_digit);
        int sum=start_digit+end_digit;
        System.out.println("and their sum is "+sum);
    }
}
