package Assignments;

import java.util.Scanner;

public class convertInchesToMeter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("value in inches");
        double a=sc.nextInt();
        System.out.println("same value in meter");
        double b=a/40;
        System.out.println(b);
    }
}
