package Assignments;

public class accept_Args {
	public static void arg(int...c){
		System.out.println("total args entered"+ c.length);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]+ " ");
			
		}
	}
	public static void main(String args[]) {
		arg(45,67,87,98);
	}

}
