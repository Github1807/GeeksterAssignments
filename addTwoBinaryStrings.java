package Geekster_assignments;

public class addTwoBinaryStrings {
	
	    public static void main(String[] args) {
	        String a="01100101";
	        String b=   "01010";
	        StringBuilder s=new StringBuilder();
	        int s1=a.length()-1;
	        int s2=b.length()-1;
	        int carry=0;
	        while(s1>=0 && s2>=0){
	            int ch1=a.charAt(s1)-'0';
	            int ch2=b.charAt(s2)-'0';
	            if(ch1+ch2+carry==3){
	                s.append('1');
	                carry=1;
	            }
	            else if(ch1+ch2+carry==2){
	                s.append('0');
	                carry=1;
	            }
	            else if(ch1+ch2+carry==1){
	                s.append('1');
	                carry=0;
	            }
	            else if(ch1+ch2+carry==0){
	                s.append('0');
	                carry=0;
	            }
	            s1--;
	            s2--;
	        }
	        while (s1>=0){
	            int ch1=a.charAt(s1)-'0';
	            if(ch1+carry==2){
	                s.append('0');
	                carry=1;
	            }
	            else if(ch1+carry==1){
	                s.append('1');
	                carry=0;
	            }
	            s1--;
	        }
	        while (s2>=0){
	            int ch1=a.charAt(s2)-'0';
	            if(ch1+carry==2){
	                s.append('0');
	                carry=1;
	            }
	            else if(ch1+carry==1){
	                s.append('1');
	                carry=0;
	            }
	            s2--;
	        }
	        s.reverse();
	        System.out.println(s);
	    }
	}

