package 入门三;
import java.util.Scanner;
import java.math.BigInteger;
public class 阶乘求和4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("行数");
		BigInteger b=new BigInteger("0");
		int c=0;
		for(int i=0;i<a;i++) {//总共有多少天
			for(int j=0;j<i;j++) {//循环一次得到一天的金币数
				//第二天,第三天总共两次循环
				//循环的元素是
				c=j+1;
				}
			b=b.add(BigInteger.valueOf(c));//内循环一次加一次

			}
			System.out.println(c);

		}
	}

