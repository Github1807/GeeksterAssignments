package geeksterAssignments;

import java.util.Scanner;

public class ArrayTakeUserInput {
    public static void main(String[] args) {
        int mark[]=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            mark[i]= sc.nextInt();
        }
    }
}

