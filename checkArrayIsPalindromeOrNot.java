package geeksterAssignments;

import java.util.Scanner;

public class checkArrayIsPalindromeOrNot {
    public static void main(String[] args) {
        int mark[]=new int[5];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<5;i++){
            mark[i]=sc.nextInt();
        }
        boolean palindrome=true;
        for(int j=0;j<=5/2;j++){
            if(mark[j]!=mark[5-j-1]){
                palindrome=false;
            }
        }
        if(palindrome){
            System.out.println("array is palindrome");
        }
        else{
            System.out.println("array is not palindrome");
        }
    }
}
