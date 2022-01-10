package Assignments;

import java.util.Scanner;

public class string_Concatenation {
    public static String concatenation_of_string(String m,String n){
        String c=m+n;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String m= sc.nextLine();
        String n= sc.nextLine();
        System.out.println(concatination_of_string(m,n));

    }
}
