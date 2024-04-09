package 入门三;
import java.util.Scanner;
public class 最长连号 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		int a=1;//长度
		int max=0;//最大
		//赋值
		for(int i=0;i<=arr.length-1;i++) {//给每一个索引赋值,从0到最后一个索引
			arr[i]=sc.nextInt();
		}
		//判断
		for(int i=0;i<arr.length-1;i++) {//假设,n=5,最大索引为4,i=3的时候是最后一次循环,包括了i+1,也就是4
			//System.out.println(arr[i+1]+"-"+arr[i]);
			if(arr[i+1]-arr[i]==1) {
			a++;
			//System.out.println(arr[i]);
			}else{
				//arr[i]!=arr[i+1]+1
				a=1;
			}
		
			if(a>max) {
				max=a;
			}
		}
		if(n==1) {
			arr[0]=sc.nextInt();
			System.out.println(1);
			return;
	   }else {
		System.out.println(max);
		}
	}

}
