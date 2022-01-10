package Assignments;

import java.util.Scanner;

public class smallestAmongthree_UsingTernary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give first number");
        int a= sc.nextInt();
        System.out.println("Give second number");
        int b= sc.nextInt();
        System.out.println("Give third number");
        int c=sc.nextInt();
        int result=(a<b && a<c)? a:(b<c)? b:c;
        System.out.println(result);
    }
}
