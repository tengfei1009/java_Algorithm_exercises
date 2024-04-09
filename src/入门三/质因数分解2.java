package 入门三;
import java.util.Scanner;
public class 质因数分解2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		int c=0;
		for(int i=2;i<Math.sqrt(a);i++) {
			if(a%i==0) {
				b=a/i;
				
				break;
			}
		}
		System.out.println(b);
	}

}
