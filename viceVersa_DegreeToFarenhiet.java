package assignments;

import java.util.Scanner;

public class viceVersa_DegreeToFarenhiet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("temperature in farenheit");
        int a= sc.nextInt();
        double b= (a-32)/1.8;

        System.out.println("same temperature in degree celcius is  "+b);
    }
}
