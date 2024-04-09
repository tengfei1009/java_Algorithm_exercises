package 入门三;
import java.util.Scanner;
public class 求极差 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		int temp=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<n-1;i++) {//假设n=5,循环4次
			//System.out.println(i);
			for(int j=0;j<arr.length-i-1;j++) {//内部次数为
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		int a=0;
	     //for(int i=0;i<arr.length;i++) {
			//System.out.print(arr[i]+" ");
	    	a= arr[n-1]-arr[0];
	    	 
	     //}
	     System.out.println(a);
		
	}

}
