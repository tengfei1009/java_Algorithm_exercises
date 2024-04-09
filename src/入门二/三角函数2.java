package 入门二;
import java.util.Scanner;
public class 三角函数2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int s=0;
		for(int i=0;i<3;i++) {
			if(a>b) {
			s=a;a=b;b=s;
			}
			if(b>c){
				s=b;b=c;c=s;
			}
			if(a>b) {
				s=a;a=b;b=s;
			}
		}
		int x=c;
		int n=a;
		 while(n%x!=0) {//3  5
			 int t =n%x;// (t记录的是余数)     3%5=3   5%3=2  3%2=1  2%1=0,跳出循环,最后b=1,是最大公约数
			 n=x;//5  3   2     1/3     我懂了,要想约分必须是分子的约数,而分子的约数最小为一,当分母与分子还可以约的时候
			 x=t;//3  2   1
	}
		 System.out.println(a/x+"/"+c/x);
}
}
