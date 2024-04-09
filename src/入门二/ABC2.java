package 入门二;
import java.util.Arrays;
import java.util.Scanner;
public class ABC2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int[]arr=new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		String s=sc.next();
		int a=s.charAt(0);//里面可以装A,B,C
		int b=s.charAt(1);//里面可以装A,B,C
		int c=s.charAt(2);//里面可以装A,B,C
		System.out.println(arr[a-'A']+" "+arr[b-'A']+" "+arr[c-'A']);//C是最大的,也就是排完序后的第三个
	}

}
