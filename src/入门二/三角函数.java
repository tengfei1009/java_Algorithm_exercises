package 入门二;
import java.util.Arrays;
import java.util.Scanner;
public class 三角函数 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int[]arr=new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	 Arrays.sort(arr);
	 int a=arr[2];
	 int b=arr[0];
	 while(a%b!=0) {//3  5
		 int t =a%b;//3%5=3   5%3=2  3%2=1  2%1=0,跳出循环,最后b=1,是最大公约数
		 a=b;//5  3   2
		 b=t;//3  2   1
	 }
	 System.out.println(arr[0]/b+"/"+arr[2]/b);
	}
	}
