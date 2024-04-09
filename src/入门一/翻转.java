package 入门一;
import java.util.Scanner;
public class 翻转 {
	public static void main(String[]args) {
		StringBuilder sb=new StringBuilder("");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
	
		/*if(a>=100&&a<1000){
			System.out.println(a);
		}else {
			System.out.println(" ");
		}*/
		
		System.out.println(sb.append(a).reverse());
		
		
	}

}
