package 入门三;
import java.util.Scanner;
public class 分类平均 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
	    double A=0;
		double B=0;
		int d=0;
		int f=0;
		for(int i=1;i<=n;i++) {
			if(i%k==0) {
				A=A+i;
				d++;
			}else {
				B=B+i;
				f++;
			}
		}
		System.out.printf("%f ",A/=d);
		System.out.printf("%f",B/=f);
		
	}

}
