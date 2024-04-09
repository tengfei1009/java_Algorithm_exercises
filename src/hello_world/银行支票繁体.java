package hello_world;
import java.util.Scanner;
public class 银行支票繁体 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int money;
		while(true) {
			System.out.println("请录入一个金额");
			money= sc.nextInt();
			if(money>=0&&money<=9999999) {//七位数
				break;
			}else {
				System.out.println("金额无效");
			}
		}
//定义一个变量用来表示钱的大小写
		String moneyStr="";
//得到money里面的每一位数字,再转成中文
		while(true) {//条件判断语句
			int ge=money%10;
			money=money/10;//循环体语句
			String capitalNumber=get(ge);
			moneyStr=capitalNumber+moneyStr;
			if(money==0) {
				break;
			}
			
		}
		//在前面补0,补齐7位
		int count =7-moneyStr.length();
		for (int i= 0;i<count;i++) {
			moneyStr="零"+moneyStr ;
		}
		System.out.println(moneyStr);
		//插入单位
		//定义一个数组表示单位
		String[]arr= {"佰","拾","万","仟","佰","拾","元"};
		String result="";
		for(int i=0;i<moneyStr.length();i++) {
			char c=moneyStr.charAt(i);
			result=result+c+arr[i];
		}
		System.out.println(result);
		
	}
	static String get(int number) {
		String[] arr= {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
		return arr[number];
	}
	}
