package 入门二;
import java.util.Scanner;
public class 月份天数 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int y=sc.nextInt();
	int m=sc.nextInt();
	if((y%4==0&&y%100!=0)||(y%100==0&&y%400==0)) {
	switch(m) {
	case 1:
		System.out.println(31);
		break;
	case 2:
		System.out.println(29);
		break;
	case 3:
		System.out.println(31);
		break;
	case 4:
		System.out.println(30);
		break;
	case 5:
		System.out.println(31);
		break;
	case 6:
		System.out.println(30);
		break;
	case 7:
		System.out.println(31);
		break;
	case 8:
		System.out.println(31);
		break;
	case 9:
		System.out.println(30);
		break;
	case 10:
		System.out.println(31);
		break;
	case 11:
		System.out.println(30);
		break;
	case 12:
		System.out.println(31);
		break;
	}
	
	}else {
		switch(m) {
		case 1:
			System.out.println(31);
			break;
		case 2:
			System.out.println(28);
			break;
		case 3:
			System.out.println(31);
			break;
		case 4:
			System.out.println(30);
			break;
		case 5:
			System.out.println(31);
			break;
		case 6:
			System.out.println(30);
			break;
		case 7:
			System.out.println(31);
			break;
		case 8:
			System.out.println(31);
			break;
		case 9:
			System.out.println(30);
			break;
		case 10:
			System.out.println(31);
			break;
		case 11:
			System.out.println(30);
			break;
		case 12:
			System.out.println(31);
			break;
		
	   }
     }
  }
}