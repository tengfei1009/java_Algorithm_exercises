package 入门三;
import java.util.Scanner;
public class 金币3 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int s=0;//定义总金币个数
		int day=1;
		int mid=0;
		while(k>=day) {
			s+=day*day;
			k-=day;
			day++;
			mid=day;
			}
		s=s+k*mid;
		System.out.println(s);
	}

}
