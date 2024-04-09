package 组内练习;
import java.util.Scanner;
public class 杨辉三角2 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);	
	int a=sc.nextInt();
	int[][]ARR=new int[a][];
	for(int i=0;i<ARR.length;i++) {
		ARR[i]=new int[i+1];//定义每个一维数组的长度
	for(int j=0;j<ARR[i].length;j++) {
		if(j==0||j==ARR[i].length-1){
			ARR[i][j]=1;
		}else {
			ARR[i][j]=ARR[i-1][j]+ARR[i-1][j-1];
		}
		
	}
	}
	for(int i=0;i<ARR.length;i++) {
		for(int j=0;j<ARR[i].length;j++) {
			System.out.print(ARR[i][j]+" ");
		}
		System.out.println();//输入一个二维数组的元素就换行
	}
	}
}
