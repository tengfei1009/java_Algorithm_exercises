package 入门三;
import java.util.Arrays;
import java.util.Scanner;
public class 找最小值 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		/*String[] arr=new String[8];
		for(int i=0;i<a;i++) {
			arr[i]=sc.next();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[0]);
		}*/
		int min=0;
		int[]arr=new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			min=arr[0];
			if(arr[i]<arr[0]) {
				min=arr[i];
			}	
		}
		System.out.println(min);
	}
}
