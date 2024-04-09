package 组内练习;
import java.util.Scanner;
public class 格子路径 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();//长
	int m=sc.nextInt();//宽
	int[][]arr=new int[n][m];
	int sum=0;
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
		arr[i][j]=sc.nextInt();
		
		}
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j+1]<arr[i+1][j]) {
				sum=sum+arr[i][j]+arr[i][j+1];
			}else {
				sum=sum+arr[i][j]+arr[i+1][j];
			}
		}
	}
	System.out.println(sum);
	}
	}
