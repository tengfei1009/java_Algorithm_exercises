package hello_world;
import java.util.Scanner;
public class 罗马数字10 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int number; 
	String str=sc.next();
	boolean flag=checkStr(str);
	for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		number =c-'0';
		String s=LuoMa(number);
		System.out.println(s);
	}
	while(true) {
	if(flag) {
		
	}else {
		System.out.println("当前字符串录入不合法请重新录入");
	}
}
	}	
	public static String LuoMa(int number) {
		String[]arr= {"I","II","III","IV","V","VI","VII","VIII","VX"};
		return arr[number];
	}
	
	public static boolean checkStr(String str) {
		if(str.length()>9) {
			return false;
		}
		for(int i=0;i<str.length();i++) {	
			char c=str.charAt(i);
			if(c>'9'||c<'0') {
				return false;
			}
		}
		return true;
}
}