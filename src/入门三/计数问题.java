package 入门三;
import java.util.Scanner;
public class 计数问题 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x=sc.nextInt();
	int []arr=new int[n];
	int s=0;
	for(int i=0;i<n;i++) {//给数组赋值,从1~n;
		arr[i]=i+1;
		//System.out.print(arr[i]+" ");
	}
	for(int i=0;i<n;i++) {
		/*if(arr[i]%10==x) {//个位
			s++;
		}
		if(arr[i]/10%10==x) {//十位
			s++;
		}*/
			//System.out.println();
		while(arr[i]>0) {//还有数值的时候
			int a=arr[i]%10;//先得到个位数   比如4213%10=3;   421%10=1;  42%10=2   4%10=4;
			arr[i]=arr[i]/10;//再得到十位数,回到个位数   4213/10=421;  421/10=42;  42/10=4  4/10=0;
			if(a==x) {
				s++;
			}
		}
		
	}
	System.out.println(s);
  }
}
