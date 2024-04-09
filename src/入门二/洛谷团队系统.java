package 入门二;
import java.util.Scanner;
public class 洛谷团队系统 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=5*a;
	int c=3*a+11;
	if(b<c) {
		System.out.println("Local");
	}else {
		System.out.println("Luogu");
	}
	}

}
