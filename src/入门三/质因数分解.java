package 入门三;
import java.util.Scanner;
public class 质因数分解 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int c=1;
		int a=sc.nextInt();
		if(a%2==0){
		    a--;
		}
		for(int i=a-1;i>=2;i=i-2) {
			for(int j=2;j<Math.sqrt(i);j++) {//从2到小于i
				if(i%j==0) {
					 c=0;
					 break;
				}else {
					c=1;
				}
			}
			if(c==1) {
				if(a%i==0) {
					System.out.println(i);
					return;
				}
			}
		}
		
		/*for(int i=a;i>=1;i--) {//从a开始到1
			if(a%i==0) {
				System.out.println(i);
			}
		}*/
	}

}
