package 入门三;
import java.util.Scanner;
public class 金币2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();//总天数
		int c=1;//第一天的金币数
		int b=0;//总金币个数
		for(int i=1;i<=a;i++) {//有多少天循环多少次
			//System.out.print(i+" ");
			a=a-i;//天数减少   最后会有剩余
			//b=b+c*c;
			c++;//一天1*1个金币,两天2*2个金币,三天3*3个金币,四天4*4个金币
		}
		//int s=b+a*c;  //b+剩余几天*最后每天的金币c;
		//System.out.println();
		for(int  i=1;i<c;i++) {
			b+=i*i;
		}//最后一次的不用管,直接让最后一次剩的天数*最后一次的金币数c,再和前之前的加到一起
		b+=a*c;
		System.out.print(b);
	}

}
