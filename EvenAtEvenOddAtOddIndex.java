package geeksterAssignmnets;

import java.util.Scanner;

public class EvenAtEvenOddAtOddIndex {
    public static void main(String[] args) {
        int mark[]=new int[8];
        Scanner sc= new Scanner(System.in);
        int even_index=0;
        int odd_index=1;
        for(int i=0;i<8;i++){
            int n= sc.nextInt();

            if(n%2==0){
               mark[even_index]=n;
               even_index+=2;
            }
            if(n%2!=0){
                mark[odd_index]=n;
                odd_index+=2;
            }
        }
    }
}
