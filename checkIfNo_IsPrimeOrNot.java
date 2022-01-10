package Assignments;

import java.util.Scanner;

public class checkIfNo_IsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;
        for (int i=1;i<num+1;i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }
            if (count==2){
                System.out.println("no is prime");
            }
            else{
                System.out.println("no is not prime");
            }

    }
}
