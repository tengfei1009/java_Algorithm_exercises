package 入门二;
import java.util.Arrays;
import java.util.Scanner;
public class 买铅笔 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();//a表示需要的铅笔数量
		int b[][]=new int[3][2];
		int sum[]=new int [3];//sum表示p老师需要购买多少件当前包装类的铅笔
		int c[]=new int[3];//c表示p老师购买之后的总价格
		for(int i=0;i<3;i++) {
			b[i][0]=sc.nextInt();
			b[i][1]=sc.nextInt();//输入对应的价格
			if(a%b[i][0]!=0) {
				sum[i]=a/b[i][0]+1;
			}else {
				sum[i]=a/b[i][0];
			}
			c[i]=sum[i]*b[i][1];
			
		}
		Arrays.sort(c);//将三行数据排序按照从小到大
		System.out.println(c[0]);//取最小的
		//sc.close();
	}

}
