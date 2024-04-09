package 无限三角形;
import java.util.Scanner;
public class 反直角三角形 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {//总共n行
			for(int j=1;j<=n;j++) {//一行最多n个*
				if(j<n-i) {//首位是1
					//System.out.print(j);
					System.out.print(" ");
				}else System.out.print("*");
			}
			System.out.println();
		}
	}

}
