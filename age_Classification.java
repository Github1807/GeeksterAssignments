package saurabh_geekster;

import java.sql.SQLOutput;
import java.util.Scanner;

public class age_Classification {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();

        if (age<5){
            System.out.println("baby");
        }
        else if(age>4 && age<11) {
            System.out.println("toddler");
        }
        else if(age>10 && age<19) {
            System.out.println("teenaged");
        }

        else if(age>18 && age<26){
            System.out.println("adult");
        }
        else{
            System.out.println("Grown old");
        }
    }
}
