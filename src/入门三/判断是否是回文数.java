package 入门三;
import java.util.Scanner;
public class 判断是否是回文数 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		String zhi = "";
		boolean c=false;
		for(int i=0;i<n.length();i++) {//遍历每一个索引
			if(n.charAt(i)=='0'&&(i==0||i==n.length()-1)) {
				continue;
			}
			zhi=zhi+n.charAt(i);
		}
		//System.out.println(zhi);
		for(int k=0;k<n.length()/2+1;k++) {//循环的次数,根据zhi的长度来判断,六个数三次,七个数四次,最后一次是中间自己和自己比较
			if(zhi.charAt(k)==zhi.length()-k-1){
			   c=true;
			}
		}
		if(c) {
			System.out.println(zhi);
		}
	}

}
