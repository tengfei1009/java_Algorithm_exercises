package 入门三;
import java.util.Scanner;
public class 级数求和 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		double s=0;
		int m=0;
		int[]arr=new int[a];
		for(int i=1;;i++) {
			s=s+1.0/i;
			m++;
			if(s>a) {
				break;
			}
		}
		System.out.println(m);
	}
}
