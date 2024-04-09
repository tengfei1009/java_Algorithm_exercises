package hello_world;
import java.util.Scanner;
public class 罗马数字9 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		boolean flag=checkStr(str);
		while(true) {
		if(flag) {
			break;
		}else {
			System.out.println("当前字符串录入不合法,请重新录入");
			continue;
		}
		}
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			int number=c-'0';
			String s =LuoMa(number);
			System.out.println(s);
				
		}
	}
	public static  String LuoMa( int number){
		String[]arr= {"","I","II","III","IV","V","VI","VII","VIII","VX"};
		return arr[number];
	}
	public static boolean checkStr(String str) {
		if(str.length()>9) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c<'0'||c>'9') {
				return false;
			}
		}
		return true;
	}

}
