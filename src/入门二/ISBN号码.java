package 入门二;
import java.util.Arrays;
import java.util.Scanner;
public class ISBN号码 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		char mod[]= {'0','1','2','3','4','5','6','7','8','9','X'};//余数
		String s=sc.nextLine();
		int a=1;
		int zhi=0;
		for(int i=0;i<11;i++) {//总共有十位数
			if(s.charAt(i)=='-') {//要是有-,则直接跳过,进入下一个循环,不能有字符
				continue;
			}
			zhi+=(s.charAt(i)-'0')*a++;//a是先用后加
		}
		if(mod[zhi%11]==s.charAt(12)){//第十二个索引
			System.out.println("Right");
		}else{
			String r=s.substring(0,12)+mod[zhi%11];//substring来截取长度//截取0到11上的元素
			System.out.println(r);
		   }
		}
	}


