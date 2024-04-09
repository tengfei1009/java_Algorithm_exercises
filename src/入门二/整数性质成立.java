package 入门二;
import java.util.Scanner;
public class 整数性质成立 {
	public static void main(String[]args) {
	boolean a;
	boolean b;
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	if(i%2==0){
		a=true;
	}else {
		a=false;
	}
	if(i>4&&i<=12) {
		b=true;
	}else {
		b=false;
	}
	
	if(a&&b){
		System.out.print(1+" ");
	}else {
		System.out.print(0+" ");
	}
	
	if(a||b){
		System.out.print(1+" ");
	}else {
		System.out.print(0+" ");
	}
	
	if((a&&!b)||(!a&&b)) {
		System.out.print(1+" ");
	}else {
		System.out.print(0+" ");
	}
	
	if(!a&&!b){
		System.out.print(1+" ");
	}else{
		System.out.print(0+" ");
	}
		
	}

}
