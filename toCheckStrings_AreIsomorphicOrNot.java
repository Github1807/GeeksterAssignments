package Assignments;

import java.awt.datatransfer.StringSelection;
import java.util.HashMap;
import java.util.Scanner;

public class toCheckStrings_AreIsomorphicOrNot {
    public static  boolean isomorphic(String a,String b){
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Boolean> map2=new HashMap<>();
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            char ch2=b.charAt(i);
            if(map1.containsKey(ch)==true){
                if(map1.get(ch)!=ch2){
                    return false;
                }
            }
            else if(map2.containsKey(ch2)==true){
                return false;
            }
            else{
                map1.put(ch,ch2);
                map2.put(ch2,true);
            }
        }
        return true;
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          String a=sc.nextLine();
          String b=sc.nextLine();
        System.out.println(isomorphic(a,b));
    }
}
