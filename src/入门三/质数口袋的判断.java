package 入门三;
import java.util.Scanner;
public class 质数口袋的判断 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=1;
		for(int i=2;i<a;i++) {
			for(int j=2;j<i;j++) {//如果要直接这样写的话,9判断第一个,说明是一个素数,然后继续循环了然后9又不是一个素数了
				if(i%j==0) {//这样可以反复覆盖,不会判断一个输出一个,这样是得不到一个结果的.
					        //直到最后一个判断完,如果最后一个还有余数的话,说明他就是一个素数.
					b=0;
					//System.out.println(i+"不是一个素数");
					break;
				}else {
					b=1;
					//System.out.println(i+"是一个素数");
				}
			}
		}
	}

}
