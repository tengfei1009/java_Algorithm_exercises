package 无限三角形;
import java.util.Scanner;
public class 菱形 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n-1;i++) {//菱形分上下两部分
			int k=i*2-1;
			//先打上半部分
			for(int j=0;j<(2*n-1-k)/2;j++) {//打印空格  一行五个位置,减去一个位置0~4,小于4,从0开始也就是除最后一位,前面四位全是空格
					System.out.print(" ");
			}
			for(int j=0;j<k;j++) {//一行有多少个*就打印多少个
				System.out.print("*");
			}
			System.out.println();
			
		}
		//再打印下半部分
		//先打印空格,再补*  第一行全是*
		for(int i=n;i>0;i--) {//先定义行数 n~1
			int k=2*i-1;//定义最大*数
			//下面第一行啥都不用打,所以0<1;在第二行的时候打印一个空格
			for(int j=0;j<(2*n-1-k)/2;j++) {//剩下的空格数,因为有左右,所以要除以2
				System.out.print(" ");
			}
			//打印*数
			for(int j=0;j<k;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
