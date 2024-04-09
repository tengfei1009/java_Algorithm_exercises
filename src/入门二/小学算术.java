package 入门二;
import java.util.Scanner;
public class 小学算术{
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in) ;
	switch (sc.nextInt()){
	case 1:
		System.out.println("I love Luogu!");
		break;
	case 2:
		System.out.printf("%d %d",6,4);
		break;
	case 3:
		System.out.printf("%d\n%d\n%d",3,12,2);
		break;
	case 4:	
		System.out.printf("%.3f",500/3.0);
		break;
	case 5:	
		System.out.println(15);
		break;
	case 6:	
		double n=Math.sqrt(6*6+9*9);
		//String m=String.format("%.4f",n);//保留四位小数
		System.out.println(10.81665382);
		break;
	case 7:	
		System.out.println("110");
		System.out.println(90);
		System.out.println(0);
		break;
	case 8:	
		double a=10*3.141593;
		double b=5*5*3.141593;
		//double c=4/3*3.141593*5*5*5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(523.598833);
		break;
	case 9:	
		System.out.println(22);
		break;
	case 10:	//1.4 5分钟
		System.out.println(9);
		break;
	case 11:	
		double d=100.0/3;
		System.out.printf("%.4f",d);
		break;
	case 12:
		//double chars=a;
		//StringBuffer sbu = new StringBuffer();
		//sbu.append((int)chars[a];
		System.out.println(13);
		System.out.println('R');
		break;
	case 13:	
		int j=(int) Math.pow((3.141593*16*4*4/3+3.141593*1000*4/3),1.0/3);
		System.out.println(j);
		break;
	case 14:	
		System.out.println(50);
		break;
	}
   }
}