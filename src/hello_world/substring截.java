package hello_world;
import java.util.Scanner;//import (输入)
public class substring截 {//substring (截取)
	public static void main (String[]args) {
		//链式编程:
		//当我们在调用一个方法的时候,不需要用变量接收他的结果,可以继续调用其他方法
	//	int len=getString().substring(1).replace(target: "A",replacement: "Q").length();
		//依赖前一个方法的结果,再去调用后面的方法
	//	System.out.println(len);//依赖前一个方法的结果
	}
	public static String getString(){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str=sc.next();
		return str;
	}

}
