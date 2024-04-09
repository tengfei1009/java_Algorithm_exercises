package 入门三;
import java.util.Scanner;
public class 一尺之棰 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();	
		int d=1;
		while(a!=1) {  
			a=a/2;
			d++;
			System.out.println(a);
			
		}
		  System.out.println(d);
		 }
	  
}

