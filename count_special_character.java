package Assignments;

import java.util.Scanner;

public class count_special_character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch<91 || ch>=97 && ch<123 || ch>=48 && ch<=57){
                continue;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}
