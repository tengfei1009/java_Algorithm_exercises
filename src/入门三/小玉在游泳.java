package 入门三;
import java.util.Scanner;
public class 小玉在游泳 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double c=2.0;
		int i=0;
		while(a-c>0) {
			
			a=a-c;
			c=c*0.98;
			i++;
		}
		System.out.println(a);
		if(a!=0) {
			i+=1;
		}
		System.out.println(i);
	}
}
