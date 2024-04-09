package hello_world;
//需求:键盘接受一个字符串,程序判断出该字符串是否是对称字符串,并在控制台打印是或不是
//对称字符串:123321 
//非对称字符串:123123
import java.util.Scanner;
public class 对称字符串 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str=sc.next();
		//反转键盘录入的字符串
		String result=new StringBuilder().append(str).reverse().toString();
		/*StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);*/
		//3.比较
		if(str.equals(result)) {
			System.out.println("当前字符串是对称字符串");
		}else {
			System.out.println("当前字符串不是对称字符串");
		}
	}

}
