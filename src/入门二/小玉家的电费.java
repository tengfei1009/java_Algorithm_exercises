package 入门二;
import java.util.Scanner;
public class 小玉家的电费 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	double b = 0;
	int a=sc.nextInt();
	if(a<=150) {
		b=0.4463*a;
	}
	if(a>150&&a<401) {
		b=150*0.4463+(a-150)*0.4663;
	}
	if(a>=401) {
		b=150*0.4463+250*0.4663+(a-400)*0.5663;
		}
	System.out.printf("%.1f",b);
	}
}
