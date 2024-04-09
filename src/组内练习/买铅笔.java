package 组内练习;
import java.util.Arrays;
import java.util.Scanner;
public class 买铅笔 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();//需要的铅笔数量
	int[][]b=new int[3][2];
	int []sum=new int[3];//三种的件数
	int []c=new int[3];//三种的价格
	for(int i=0;i<3;i++) {
		b[i][0]=sc.nextInt();//输三个规格
		b[i][1]=sc.nextInt();//输入价格
		if(a%b[i][0]!=0) {
			sum[i]=a/b[i][0]+1;//件数
		}else {
			sum[i]=a/b[i][0];
		}
		c[i]=sum[i]*b[i][1];
	}
	Arrays.sort(c);//将数组c按从大到小排列
	System.out.println(c[0]);
	sc.close();
	}

}
