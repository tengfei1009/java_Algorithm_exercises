package 入门二;
import java.util.Scanner;
public class 陶陶摘苹果 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int []arr=new int[10];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	int s=sc.nextInt();
	int n=0;
	for(int i=0;i<arr.length;i++) {
		if(s+30>=arr[i]) {
			n++;
		}
	}
	System.out.println(n);
	}

}
