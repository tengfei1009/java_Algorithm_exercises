package 无限三角形;

import java.util.Scanner;

public class 正倒直角三角形 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//要多少行
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++){//一行最多n个*
				if(j>=i) {
					System.out.print("*");
				}//else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
