package 入门一;
import java.util.Scanner;
public class 大象喝水 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int r=sc.nextInt();
	    double d=3.14*r*r;
	     double s=h*d;
	     int t=(int)(20000/s)+1;
	    System.out.println(t);
	}

}
