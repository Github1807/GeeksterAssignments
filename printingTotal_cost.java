package assignments;

import java.util.Scanner;

public class printingTotal_cost {
    public static double print_cost(double a){
        a-=a/10;
        a=a*100;
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the unit to calculate cost and second unit is equal to 100");
        double a= sc.nextDouble();
        System.out.println("after 10 % discount the cost will become  "+print_cost(a));
    }
}
