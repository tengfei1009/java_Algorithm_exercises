package 入门一;
import java.util.Scanner;
public class 罗马数字1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);//1234a
		String str;
		while(true) {//用输入的长度来表示循环几次
		    System.out.println("请输入一个字符串");
		    str=sc.next();
			boolean flag=checkStr(str);
		//用到一个循环,调每次遍历得到的值
		
		if(flag) {
			break;
		}else {
		System.out.println("当前的字符串不符合规则,请重新输入");

		}
		}
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			System.out.println(c);
			int number=c-'0';//自动转化
			//调用方法
			String s=changeLuoMa(number);
			System.out.println(s);
		}
	}
	public static String changeLuoMa (int number) {
		//定义一个数组,让索引跟罗马数字产生一个对应关系
		String[]arr= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	    return arr[number];
	}
	public static boolean checkStr(String str){
		//要求长度小于9
		if(str.length()>9) {
			 return false;
		}//不返回
		//只能是数字,遍历数组
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c<'0'||c>'9') {
				return false;
			}
		}
		return true;//for循环结束,一个一个判断完毕
	}
}
