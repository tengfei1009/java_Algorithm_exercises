package hello_world;
import java.util.Scanner;
public class 斐波那契数列 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		double a1=1.0;//第一项
		double a2=1.0;//第二项
		int n=sc.nextInt();//定义多少项
		if(n==1||n==2) {
			System.out.println(1.0);
		}
		double a3=0;
		for(int i=2;i<n;i++) {//从第三项开始,循环一次得到a3,也就是最后一项
			a3=a1+a2;
			a1=a2;
			a2=a3;
			
		}
		System.out.printf("%.2f",a3);
	}

}
