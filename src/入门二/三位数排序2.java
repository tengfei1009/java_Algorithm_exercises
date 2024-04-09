package 入门二;
import java.util.Scanner;
public class 三位数排序2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=0;
		if(a>b) {
			d=a; a=b;b=d;
		}
		if(b>c) {
			d=b; b=c;c=d;
		}
		if(a>b) {
			d=a; a=b;b=d;
		}
		System.out.println(a+" "+b+" "+c);
	}
	
	

}
