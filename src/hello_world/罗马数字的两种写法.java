package hello_world;
import java.util.Scanner;
public class 罗马数字的两种写法 {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		String str= sc.next();
		checkStr(str);
	}
	//要求(校验,定义方法)
	public static boolean checkStr(String str){
		//要求一:长度小于等于9
		if(str.length()>9) {
			return false;
		}
		//要求二只能是数字
		String str1="";//4253
		String[] strs= {"I","II","III","IV","V","VI","VII","VIII","IX"};
		for(int i=0;i<str.length();i++) {//索引
			char c=str.charAt(i);
			if(c!='0') {
				str1+=strs[c-'0'-1]+" ";
			}
			
		}
		System.out.println(str1);
		return true;
	}
}
