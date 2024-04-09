package 入门三;
import java.util.Scanner;
public class 求三角形 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1;
		for(int i=0;i<n;i++) {//定义多少层
			for(int j=1;j<=n;j++) {//每一行多少个
				System.out.printf("%02d",a);
				a++;
			}
			System.out.println();
		}
		System.out.println();
		int b=1;
		/*for(int i=1;i<=n;i++) {//补空格
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");//打两个空格,因为都是两位数
			}		
			for(int j=0;j<i;j++) {
				System.out.printf("%02d",b);
				b++;
			}
			System.out.println();
		}*/
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<i;j++) {
				System.out.printf("%02d",b);
				b++;
			}
			System.out.println();
		}
	}
}
/*}else {
}*/