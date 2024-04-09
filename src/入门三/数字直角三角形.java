package 入门三;
import java.util.Scanner;
public class 数字直角三角形 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[][]arr=new int[a][];
		int t=0;
		for(int i=0;i<arr.length;i++) {//5行
			for(int j=0;j<a;j++) {//循环五次
				t++;
				System.out.printf("%02d",t);
			}
			a=a-1;
			System.out.println();
			
		}
	}

}
