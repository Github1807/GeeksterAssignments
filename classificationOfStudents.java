package Assignments;

import java.util.Scanner;

public class classificationOfStudents{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the gender");
        String gender= sc.nextLine();
        System.out.println("enter the marks");
        int mark= sc.nextInt();
        if(gender.equals("m") && mark>0 && mark<101){
            if(mark>75){
                System.out.println("intelligent boy");
            }
            else if(mark>35){
                System.out.println("average boy");
            }
            else{
                System.out.println("dull boy");
            }
        }
        else if(gender.equals("f") && mark>0 && mark<101){
            if(mark >75){
                System.out.println("intelligent girl");
            }
            else if(mark>35){
                System.out.println("average girl");
            }
            else{
                System.out.println("dull girl");
            }
        }

    }
}
