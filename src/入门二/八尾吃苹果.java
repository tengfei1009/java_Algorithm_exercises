package 入门二;
import java.util.Scanner;
public class 八尾吃苹果 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int t=sc.nextInt();
	int s=sc.nextInt();
	
	
	if(t==0) {
		System.out.println(0);
		return ;
	}
	if(s==0) {
		System.out.println(m);
		return ;
	}
	int num=m-s/t;
	if(num<=0) {
		System.out.println(0);
	}
	if(s%t==0) {
		System.out.println(num);
		
	}
	else {
		System.out.println(num-1);
	}
	}
}