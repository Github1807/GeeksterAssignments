package geeksterAssignments;

import java.util.Scanner;

public class InsertTheElementAtGivenIndex {
    public static void main(String[] args) {
        int arr[]=new int [10];
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of index at which you want to insert the element");
        int index=sc.nextInt();
        System.out.println("enter the value which you want to insert");
        int value= sc.nextInt();
        while(index>=arr.length){
            System.out.println("index is out of bounds please enter a valid index");
            index= sc.nextInt();
        }
        arr[index]=value;
        System.out.println(arr[index]+" is inserted at  "+index+" index");
    }
}
