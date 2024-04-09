package 无限三角形;
import java.util.Scanner;
public class 空心等腰三角形 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {//定义多少行
			int k=2*i-1;
			for(int j=0;j<(2*n-1-k)/2;j++) {
				System.out.print(" ");
				
				}
			//补完空格,补*
			for(int j=0;j<k;j++) {
				if(j==0||j==k-1||i==n) {//或者等于最后一行
					System.out.print("*");
				}else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
