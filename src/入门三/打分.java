package 入门三;
import java.util.Scanner;
public class 打分 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int []arr=new int[a];
		int c=0;
		double s=0;
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
			s+=arr[i];
		}
		for(int i=0;i<a-1;i++) {//冒泡顺序
			for(int j=0;j<a-i-1;j++) {//每循环一次,就少一个数,少一个数少循环一次
				if(arr[j]>arr[j+1]) {
					c=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=c;
					
				}
			
			}
		}
		/*for(int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
		}*/
		s=(s-arr[0]-arr[a-1])/(a-2);
	    System.out.printf("%.2f",s);
	}

}
