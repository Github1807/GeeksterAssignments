package Assignments;

import java.util.Scanner;

public class convertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary number to be converted");
        int n= sc.nextInt();
        int base=1;
        int decimal_value=0;
        int last_digit;
        while(n>0){
            last_digit=n%10;
            n=n/10;
            decimal_value+=last_digit*base;
            base=base*2;

        }
        System.out.println("value of this binary number is  "+decimal_value);
    }
}
