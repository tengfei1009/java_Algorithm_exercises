package 入门三;
import java.util.Scanner;
public class 数字反转{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		String zhi = "";
		if(n.equals("0")||n.equals("-0")) {
			System.out.println("0");
			return ;
		}
		for(int i=0;i<n.length();i++) {//遍历每一个索引
			if(n.charAt(i)=='-') {
				continue;
			}
			if(n.charAt(i)=='0'&&(i==0||i==n.length()-1)) {
				continue;
			}
			zhi=zhi+n.charAt(i);
	}
		//System.out.println(zhi);
		//下面反转字符串
		StringBuilder sb=new StringBuilder();
		sb.append(zhi);
		int i=zhi.length();//最大索引
		//通过i--,省略后面的零
		while(zhi.charAt(--i)=='0'){//从最后一个索引开始,倒着如果等于0,使i减小,就是后面那些等于0的不要了
			//i--如果不满足也就跳出循环,但是i已经是i--了
			
		};//倒数第二个索引
		
		
		if(n.charAt(0)=='-') {
			System.out.print('-');
			
		}
//		因为省略后面的零了,倒着遍历就是反转字符,最后有负数就是和前面的 - 拼接
		for(int j=i;j>=0;j--) {    //i此时是最后一位,后面等于0的位数都不打印
			System.out.print(zhi.charAt(j));
		}
   }
}	