package 入门三;
import java.math.BigInteger;
import java.util.Scanner;
public class 阶乘求和6 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		BigInteger c=new BigInteger("0");
		//精度化
		for(int i=1;i<=n;i++) {//定义n个数
			BigInteger a= new  BigInteger("1");
			for(int j=1;j<=i;j++) {//从1开始一直乘到i
				a=a.multiply(BigInteger.valueOf(j));
			}
			c=c.add(a);
		}
		System.out.println(c);

	}

}
