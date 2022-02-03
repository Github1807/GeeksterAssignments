package Geekster_assignments;
import java.util.Scanner;


public class toPrintFirstNonRepeatedCharacterOfString

{
	
	
	    public static int char_count(char a,String s){
	        int count=0;
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            if(ch==a){
	                count++;
	            }
	        }
	        return count;
	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String s= sc.nextLine();
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            if(char_count(ch,s)==1){
	                System.out.println(ch);
	                break;
	            }
	        }
	    }
	}

