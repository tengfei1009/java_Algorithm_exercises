package 入门二;
import java.util.Scanner;
public class 三位数排序 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=0;//5  9  2
		//先A和B比较,若B比A大,不换位置,A是最小的,放在a的位置
		if(a>b) {
			d=a;a=b;b=d;
		}
		//再让B与C比较,若B比C大,交换位置,B就是最大的,放在c的位置
		if(b>c) {
			d=b;b=c;c=d;
		}
		//最后再让A与C比较,若A大,交换位置,C就是最小的,放在a的位置
		if(a>b) {
			d=a;a=b;b=d;
		}
		System.out.println(a+" "+b+" "+c+" ");
		
	}
			
  }
