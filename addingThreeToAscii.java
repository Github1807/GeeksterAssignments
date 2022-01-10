package Assignments;

import java.util.Scanner;

public class addingThreeToAscii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.nextLine().charAt(0);
        System.out.println("enter the  value to be added in tha ascii value of the character");
        int num=sc.nextInt();
        int value=ch+num;
        char result=(char)value;
        System.out.println(result);

    }
}
