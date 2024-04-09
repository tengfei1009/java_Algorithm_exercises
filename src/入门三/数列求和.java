package 入门三;
import java.util.Scanner;
public class 数列求和 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int s=0;
		int sum=0;
		for(int i=1;i<=a;i+=2) {//这个后面加的好像是公差  表示a以内,公差为(2)的等差数列的和
			sum=sum+i;
			s++;
		}
		System.out.println(sum);
		System.out.println(s);//公差为2;前四项只有两个数,首项为1 (1,3)
	}

}
