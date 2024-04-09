package hello_world;
import java.util.Scanner;
public class 杨辉三角2 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int level=sc.nextInt();
	int [][]arr=new int[level][];
	for(int i=0;i<arr.length;i++) {
		arr[i]=new int[i+1];
		for(int j=0;j<arr[i].length;j++) {
			if(j==0||j==arr[i].length-1) {//每一行最后一个索引
				arr[i][j]=1;
			}else {
				arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print (arr[i][j]+" ");
		}
		System.out.println();
	}
	}
	

}
