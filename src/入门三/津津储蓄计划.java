package 入门三;
import java.util.Scanner;
public class 津津储蓄计划 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int []arr=new int [12];
		int s=0;//定义每个月总钱数
		int c=0;//定义张数
		int mid=0;
		int d=1;//定义月份
		for(int i=0;i<arr.length;i++) {//每个月花的钱
			arr[i]=sc.nextInt();//赋值
		}
		for(int i=0;i<arr.length;i++) {//一直到12月
			//第一个月的钱
			 mid+=300-arr[i];//这个月可不可能剩钱
			//System.out.println(s);
			if(mid>=0) {
				//真好,又活了一个月
			}else {//没活下去
				System.out.println("-"+d);
				return;
			}
			if(mid>=100) {//比一百多就要存起来
				c=c+(mid/100);//给妈妈存的钱数
				mid%=100;
			}
			d++;
		}
		s=mid+(c*120);
		System.out.println(s);
	}

}
