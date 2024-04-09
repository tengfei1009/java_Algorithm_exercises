package 无限三角形;
import java.util.Scanner;
public class 正直角三角形 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {//一共n行
			for(int j=0;j<n;j++) {//一行最多j个*
				if(j<=i) {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}

}
