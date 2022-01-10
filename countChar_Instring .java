package Assignments;

import java.util.Scanner;

public class countChar_Instring {
    public static int  count_character(String a){
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=' '){
                count ++;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        System.out.println(count_the_character(a));
    }
}
