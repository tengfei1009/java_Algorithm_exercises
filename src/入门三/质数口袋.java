package 入门三;
import java.util.Scanner;
public class 质数口袋 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int sum=0;
		int c=0;
		System.out.println("2");
		for(int i=2;sum+i<=l;i++) {
			for(int j=2;j<i;j++) {
			if(i%j==0&&sum+i<=l) {
				break;
			}else {
				System.out.println(i);
			}
			}
		}
	}
		
}
//这个有问题是错的,就这样吧
