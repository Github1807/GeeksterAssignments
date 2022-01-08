package Assignments;


public class volumeOf_SquareNRectangle {
	public static int volume(int a, int b, int c) {
		int volume=0;
		volume=a*b*c;
		System.out.println("Volume of Rectangle");
		return volume;
	}
	public static int volume(int s) {
		int volume=0;
		volume=s*s*s;
		System.out.println("Volume of Sqaure");
		return volume;
	}
	public static void main(String args[]) {
		System.out.println(volume(3,6,9));
		System.out.println(volume(9));
		
		
	}
}
