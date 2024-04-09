package 入门二;
import java.util.Scanner;
public class 津津不高兴2 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);	
	/*int[][]arr=new int[7][2];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;i++) {
		int a=sc.nextInt();
		int b=sc.nextInt();
    System.out.println(arr[i][j]+" ");
		
		}
	}*/
	int index=0,max=0;
	for(int i=0;i<7;i++) {
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a+b>max&&a+b>8) {
			max=a+b;
			index=i+1;
		}
	}
	System.out.println(index);
	}
}
