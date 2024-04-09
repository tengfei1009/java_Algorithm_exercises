package 入门二;
import java.util.Scanner;
public class ISBN2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int zhi=0;
		int b=1;
        char[]mod= {'0','1','2','3','4','5','6','7','8','9','X'};//与最后一个数做比较;相当于正确的最后一个数
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if(c=='-') {
				continue;
			}
			zhi=zhi+(c-'0')*b++;
			}
		if(mod[zhi%11]==a.charAt(12)) {//都是字符类型的
			System.out.println("Right");
		}else {
			System.out.println(a.substring(0,12)+mod[zhi%11]);
		}

		}
	}

