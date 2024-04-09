package 入门一;
import java.util.Scanner;
public class 牛牛成绩 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=(int)(a*0.2+b*0.3+c*0.5);
		System.out.println(d);
	}

}
