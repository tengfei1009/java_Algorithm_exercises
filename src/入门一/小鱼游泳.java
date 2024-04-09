package 入门一;
import java.util.Scanner;
public class 小鱼游泳 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e;
		int f;
		if(b>d) {
			f=d+60-b;e=c-a-1;
		}else {
			f=d-b;e=c-a;
		}
		System.out.print(e);
		System.out.print(" "+f);
		}
		
	}
