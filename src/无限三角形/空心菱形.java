package 无限三角形;
import java.util.Scanner;
public class 空心菱形 {
	public static void main(String[]args) {
		//定义行再定义列
		Scanner sc =new Scanner(System.in);
		int sum =sc.nextInt();
		for (int i = 1; i <= sum; i++) {
			//打印空格
			for (int j = 1; j <=sum-i; j++) {
				System.out.print(" ");
			}
			//打印*数
			for(int j=1;j<=2*i-1;j++){
				if(j==1||j==2*i-1){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = sum-1; i >= 1; i--) {
			//打印空格
			for (int j = 1; j <=sum-i; j++) {
				System.out.print(" ");
			}
			//打印*数
			for(int j=1;j<=2*i-1;j++){
				if(j==1||j==2*i-1){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
