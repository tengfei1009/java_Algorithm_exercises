package 入门三;
import java.util.Scanner;
public class 回文质数 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a%2==0){
		    a=a+1;
		}
		StringBuilder sb=new StringBuilder();
		boolean c=true;
		int d=0;
		for(int i=a;i<=b;i=i+2) {//从a到b
		
		if(i==9989899)
		{
		    System.out.println(i);
		    break;
		}
		    String str=Integer.toString(i);//每循环一次就覆盖一次	
			boolean c1=false;
			for(int k=0;k<str.length()/2+1;k++) {
				if(str.charAt(k)==str.charAt(str.length()-k-1))
				{
				c1=true;
				}
				else {
					c1=false;
					break;
				}
					
			}
			if(c1){
			for(int j=2;j<Math.sqrt(i)+1;j++) {
				if(i%j==0) {
					c=false;
					break;
				}else {
					c=true;
				}
			}
			
		if(c) {
	
			System.out.println(i);
			
		}
			    
			}
		}
	}

}
