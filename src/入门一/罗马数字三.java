package 入门一;
import java.util.Scanner;
public class 罗马数字三 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str=sc.next();
		boolean flag=true;
		while(flag) {
		flag=checkStr(str);
		
		}
		
	}
	public static boolean checkStr(String str) {
		if(str.length()>9) {
			return false;
		}
		for(int i=0;i<str.length();i++) {//循环九次
			char c=str.charAt(i);//提取索引中的数字
			if(c<'0'||c>'9') {
				return false;
			}	
		}
		return true;
	}

}
