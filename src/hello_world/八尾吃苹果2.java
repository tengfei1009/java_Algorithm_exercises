package hello_world;
import java.util.Scanner;
public class 八尾吃苹果2 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int t=sc.nextInt();
	int s=sc.nextInt();
	if(t==0) {
	System.out.println(0);
	return;
   }
	int p=m-s/t;
	if(m*t<s) {
		System.out.println(0);
		return;
	}
	if(s%t==0) {
		System.out.println(p);
	}else {
		System.out.println(p-1);
	}
}
}