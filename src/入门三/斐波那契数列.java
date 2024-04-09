package 入门三;
import java.util.Scanner;
public class 斐波那契数列 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		double a1=1.0;
		double a2=1.0;
		int n=sc.nextInt();
		if(n==1||n==2) {
			System.out.println(1);
			return ;
		}
		double a3=0;
		for(int i=2;i<n;i++) {//从2开始后一项等于前两项之和,从2到第n个  如果求第三项就需要循环一次,如果求第四项只需要循环两次,也就是从第一项开始加两次.
			a3=a1+a2;//求最后一项,也就是第n项,当i=n时,跳出循环
			a1=a2;
			a2=a3;
		}
		System.out.printf("%.2f",a3);
	}

}
