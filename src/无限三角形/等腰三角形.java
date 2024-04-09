package 无限三角形;
import java.util.Scanner;
public class 等腰三角形 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {//定义n行
			int k=2*i-1;
			//先补空格
			for(int j=0;j<(2*n-1-k)/2;j++) {
				System.out.print(" ");
			}
			//再填*
			for(int j=0;j<k;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
