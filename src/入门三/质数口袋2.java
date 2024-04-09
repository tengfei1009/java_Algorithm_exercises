package 入门三;
import java.util.Scanner;
public class 质数口袋2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int b=1;
		int sum=0;
		int c=0;
		int a=sc.nextInt();
		for(int i=2;i<a;i++) {//小于就继续循环
			for(int j=2;j<i;j++) {//输入的是2,进入不了内循环
				if(i%j==0) {//小于a的所有质数  如果直接输出满足条件的i,内循环不会结束,会一直判断这个数到循环结束,所以也是打印不了的   
					b=0;
					break;//有一个不满足就直接输出!再不看后面的
				}else {
					b=1;
				}
			}
			if(b==1){
			sum=sum+i;
			if(sum<=a){
				System.out.println(i);
				c++;
			}else {
				break;
			      }
		     }
	     }
		 System.out.println(c);
   }	
}
	 