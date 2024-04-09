package 测试1;
import java.util.Scanner;
public class 杨辉各种三角 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		//二维数组
		int a=sc.nextInt();
		int[][]arr=new int[a][];
		for(int i=a;i>0;i--) {
			for(int j=i;j<i;j--) {
//				if(arr[i][j]==arr[0][0])
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				System.out.println(arr[i][j]);
			}
			
			System.out.println();
		}
		
	}

}
