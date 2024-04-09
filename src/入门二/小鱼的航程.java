package 入门二;
import java.util.Scanner;
public class 小鱼的航程 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();//过了几天
		int s=0;
		for(int i=0;i<n;i++) {//从周一开始;过了一天,游了250
			if(x==8) {
				x=1;
			}
			if(x!=6 && x!=7) {
				s=250+s;
			}
			x++;
		}
		System.out.println(s);
	}
}
