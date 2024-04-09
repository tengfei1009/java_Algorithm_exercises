package 无限三角形;
import java.util.Scanner;
public class 空倒等腰三角形 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			int k=2*i-1;
			//补空格
			for(int j=0;j<(n*2-1-k)/2;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<k;j++) {
				if(j==0||j==k-1||i==n) {//或者等于最后一行(y坐标)
					System.out.print("*");
				}else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
