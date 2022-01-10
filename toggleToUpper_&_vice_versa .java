package Assignments;

import java.util.Scanner;

public class toggleToUpper_&_vice_versa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.nextLine().charAt(0);

        if(ch>=97 && ch<=122){
            char uc=(char)(ch-'a'+'A');
            System.out.println(uc);
        }
        if(ch>=65 &&ch<=90){
            char lc=(char)(ch-'A'+'a');
            System.out.println(lc);
        }
        else{
            System.out.println("unable to convert non alphabetic value to a alphabetic");
        }

    }
}
