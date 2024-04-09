package 入门三;
import java.util.Scanner;
import java.math.BigInteger;
public class 阶乘求和5 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		BigInteger b=new BigInteger("0");
		for(int i=1;i<=a;i++) {
			BigInteger c=new BigInteger("1");
			for(int j=1;j<=i;j++) {
				c=c.multiply(BigInteger.valueOf(j));//从c到j中每一个数的阶乘
			}
			//System.out.println(c);
			b=b.add(c);
		}
		System.out.println(b);
	}
}
