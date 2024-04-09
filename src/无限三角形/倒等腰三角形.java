package 无限三角形;
import java.util.Scanner;
public class 倒等腰三角形 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){//定义行数
			int k=i*2-1;
			//先补空格
			for(int j=0;j<(n*2-1-k)/2;j++) {//合适就循环一次,全看i++
				System.out.print(" ");
			}
			for(int j=0;j<k;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
