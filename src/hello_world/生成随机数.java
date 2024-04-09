package hello_world;
import java.util.Random;
import java.util.Scanner;
public class 生成随机数 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int  a=sc.nextInt();
		for(int i=0;i<a;i++) {
			int d=r.nextInt(100)+1;
			System.out.print(d+" ");
		}
	}

}
