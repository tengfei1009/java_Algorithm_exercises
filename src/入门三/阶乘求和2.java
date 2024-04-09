package 入门三;
import java.util.Scanner;
import java.math.BigInteger;
public class 阶乘求和2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		BigInteger a=new BigInteger("0");
		for(int i=1;i<=n;i++) {//从一到n的阶乘
			BigInteger b=new BigInteger("1");
			for(int j=1;j<=n;j++) {
				b=b.multiply(BigInteger.valueOf(j));//从1到j的阶乘
				System.out.println(b);
			}
			a=a.add(b);
		}
		System.out.println(a);
	}

}
