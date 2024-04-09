package 入门二;
import java.util.Scanner;
public class 三角形分类 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c = sc.nextInt();
		//不能
		if(a+b<=c||b+c<=a||a+c<=b) {
			System.out.println("Not triangle");
			return;
		}
		     //直角三角形
			if((a*a+b*b==c*c)||(a*a+b*b==b*b)||(b*b+c*c==a*a)) {
				System.out.println("Right triangle");
				if((a*a+b*b>c*c)&&(a*a+c*c>b*b)&&(b*b+c*c>a*a)) {
					System.out.println("Acute triangle");
				//等腰直角三角形
				if(a==b||a==c||b==c) {
				System.out.println("Isosceles triangle");
				}
				//等边三角形
				if(a==b&&b==c) {
					System.out.println("Equilateral triangle");
				}
				}
				return;
			}
				//锐角三角形
				if((a*a+b*b>c*c)&&(a*a+c*c>b*b)&&(b*b+c*c>a*a)) {
					System.out.println("Acute triangle");
				//等腰直角三角形
				if(a==b||a==c||b==c) {
				System.out.println("Isosceles triangle");
				}
				//等边三角形
				if(a==b&&b==c) {
					System.out.println("Equilateral triangle");
				}
				}else {
					System.out.println("Obtuse triangle");
					if(a==b||a==c||b==c) {
						System.out.println("Isosceles triangle");
					}
				}

	
	
	
				//钝角三角形
				/*if((a*a+b*b<c*c)&&(a*a+c*c<b*b)&&(b*b+c*c<a*a)) {
				System.out.println("Obtuse triangle");
				if(a==b||a==c||b==c) {
					System.out.println("Isosceles triangle");
				}
			
	}*/
			
}
}
		
