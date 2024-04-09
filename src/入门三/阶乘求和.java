package 入门三;
import java.math.BigInteger;
import java.util.Scanner;
public class 阶乘求和 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		BigInteger c=new BigInteger("0");
		for(int i=1;i<=n;i++) {
			BigInteger d=new BigInteger("1");
			for(int j=1;j<=i;j++) {
				d=d.multiply(BigInteger.valueOf(j));
				
			}
			c=c.add(d);
		}
		System.out.println(c);
		}

}
