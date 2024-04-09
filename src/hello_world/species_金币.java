package hello_world;
import java.util.Scanner;
public class species_金币 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i=1;//第一天
		int s=1;//第一天的金币
		while(a>i) {//第一天开始
			a-=i;//减完一组应该还剩多少天,如果不够下一组的天数就会变成负数
			i++;
			s+=i*i;
			//System.out.println(s);
		}
		s=s+(a-i)*i;
		System.out.println(s);
	}

}
