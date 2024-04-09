package hello_world;
import java.util.Scanner;
public class 素数 {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();//5
		int i;
		for(i=2;i<a;i++) {
			if(a%i==0){
				System.out.println(a+"不是一个素数");
				break;
			}
		
	
			}
		
		if(i==a) {
			System.out.println(a+"是一个素数");
		}
		}
	}
