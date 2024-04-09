package 入门一;
import java.util.Scanner;
public class 小玉买文具 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int count;
		int a=sc.nextInt();
		int b=sc.nextInt();
		/*for(;;){
		if(a>1&&b>=9){
		a=a-1;count++;
		}else if(a>1&&b<9) {
			a=a-2;count++;
		}else if(a<1) {
			break;
        }*/
		count=(a*10+b)/19;
		System.out.println(count);
	  }
 
	}

