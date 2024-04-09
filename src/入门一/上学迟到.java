package 入门一;
import java.util.Scanner;
public class 上学迟到 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int v=sc.nextInt();
		int t=s/v+10;
		int d=s%v;
		if(d!=0) {
			t++;
		}
		//不超过八小时
		if(t<480) {
		int a=7-(t/60);
		int b=60-(t%60);
		System.out.printf("%02d:%02d",a,b);
		}else {  
		int a=(24*60-t+480)/60;
		int b=t%60;
		
		System.out.printf("%02d:%02d",a,b);
		}
		
		}
				
	}

