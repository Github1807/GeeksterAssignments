package Assignments;

import java.util.Scanner;

public class minutesIntoYear&Days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter minutes");
        int a= sc.nextInt();
        int day=a/1440;
        if(day>=365){
            int year=day/365;
            day=day%365;
            System.out.println("in "+a+" minutes there is "+year+" year and "+day+" days");
        }
        else {
            System.out.println("there is "+day+" days");
        }
    }
}
