package hello_world;
import java.util.Scanner;
public class 杨辉三角3 {
	public static void main (String[]args) {
	Scanner sc=new Scanner(System.in);
	int level=sc.nextInt();
	int[][]ARR=new int[level][];
	for(int i=0;i<ARR.length;i++) {
	    ARR[i]=new int [i+1];
	    for(int j=0;j<ARR[i].length;j++) {
	    	if(j==0||j==ARR[i].length-1) {
	    		ARR[i][j]=1;
	    	}else {
	    		ARR[i][j]=ARR[i-1][j]+ARR[i-1][j-1];
	    	}
	    }
	}
	for(int i=0;i<ARR.length;i++) {
		for(int j=0;j<ARR[i].length;j++) {
			System.out.print(ARR[i][j]+" ");
			
		}
		System.out.println();
	}
	}

}
