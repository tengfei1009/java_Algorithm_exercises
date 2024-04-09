package 入门一;

import java.util.Scanner;

public class 开根号 {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			double c=sc.nextDouble();
			
			double p=(1.0/2)*(a+b+c);
			p=p*(p-a)*(p-b)*(p-c);
			p=Math.sqrt(p);//开根号
			System.out.println(String.format("%.1f",p));
		}

	}


