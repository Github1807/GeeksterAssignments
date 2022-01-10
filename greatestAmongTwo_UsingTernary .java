package Assignments;

import java.util.Scanner;

public class greatestAmongTwo_UsingTernary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give first number");
        int a= sc.nextInt();
        System.out.println("Give second number");
        int b=sc.nextInt();
        int result=(a>b)? a:b;
        System.out.println(result);
    }
}
