package Assignments;
import java.util.Scanner;
public class sum_Of_array_elements {
    public static int arraySum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int score[]=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            score[i]= sc.nextInt();
        }
        System.out.println(arraySum(score));
    }
}
