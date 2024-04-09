package 组内练习;
import java.util.Scanner;
public class 杨辉三角 {
	public static void main(String[]args) {
		
	//杨辉三角上面和左边的和
	/* int[][]x=new int[5][];
	for(int i=0;i<x.length;i++) {
		x[i]=new int[i+1];
		
	}
	} */
	
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入杨辉三角的行数");
		int level =sc.nextInt();
		int[][]arr=new int[level][];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new int[i+1];//假设第一行i=0,那么二维数组第一个索引对应的一维数组中的元素为i+1,也就是1个
			for(int j=0;j<arr[i].length;j++) {//因为上面定义了一维数组最小长度为1,,也就是可以填充一个0索引
				if(j==0||j==arr[i].length-1) {
					//定义第一行,也就是第一个二维数组0索引对应的一维数组中只存储一个0索引,索引对应的元素为1
					//同时也限定了二维数组中每个一维数组的最后一个索引对应的值为1
					arr[i][j]=1;
				}else {
					arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
				}
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();//每循环一个一维数组换行
		}
	}
}
