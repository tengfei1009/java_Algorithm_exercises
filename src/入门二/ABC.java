package 入门二;
import java.util.Arrays;
import java.util.Scanner;
public class ABC {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int[]arr=new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=sc.nextInt();
			
		}
		Arrays.sort(arr);//sort,排序
		
		
		/*String c[]=new String[3];
		for(int j=0;j<3;j++) {
			 c[j]=sc.next()-('A');
			System.out.println(arr[j]);
			}
		}*/
		String str=sc.next();
		char a=str.charAt(0);
		char b=str.charAt(1);
		char c=str.charAt(2);
		System.out.println(arr[a-'A']+" "+arr[b-'A']+" "+arr[c-'A']);
	}
	

}
