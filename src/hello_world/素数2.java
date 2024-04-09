package hello_world;
import java.util.Scanner;
public class 素数2 {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<a;i++){
			if(a%i==0) {
			flag=false;
			break;
			}
			
		}
		if(flag) {
			System.out.println(a+"是一个素数");
		}else {
			System.out.println(a+"不是一个素数");
		}
	}

}
