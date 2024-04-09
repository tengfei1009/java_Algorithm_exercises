package 入门一;
import java.util.Scanner;
public class 罗马数字2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();;//str=1234a
		System.out.println("请输入一个字符串");
		while(true) {
			boolean flag=checkStr(str);
			//checkStr(str);//用一个变量接收每次遍历得到的数
			if(flag) {
				break;
			}else {
				System.out.println("当前录入字符串不合格请重新录入");
				continue;
			} 
			
		}
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			System.out.println(c);
			int number=c-'0';//获得数字
			String s=luoMa(number);
			System.out.print(s);
	}
	}
	//联系
	public static  String luoMa(int number) {
		//定义数组
		String[] arr= {" ","I","II","III","IV","V","VI","VII","VIII","VX"};
		 return arr[number];
	}
	//定义方法
	public static boolean checkStr(String str){
		//要求长度小于9
		if(str.length()>8) {
			return false;
		}
		//只能是数组,遍历数组
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c<'0'||c>'9') {
				return false;//a
			}
		}
		return true;//for循环结束
	}
		
}
