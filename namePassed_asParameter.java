package Assignments;
import java.util.Scanner;
public class namePassed_asParameter {
  public static void firstName(String name) {
	  System.out.println("Hello "+name);
  }
  public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
	  String name = sc.nextLine();
	  firstName(name);
  }
}
