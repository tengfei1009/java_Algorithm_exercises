package 入门二;
import java.util.Scanner;
public class 闰年判断 {
	public static void main(String[]args) {
		
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	
	boolean s=Run(a);
	if(s) {
		System.out.println(1);
	}else {
		System.out.println(0);
	}
	}
	public static boolean Run(int a) {
		if((a%4==0&&a%100!=0)||(a%100==0&&a%400==0)) {
			return true;
		}else {
			return false;
		}
	}

}
