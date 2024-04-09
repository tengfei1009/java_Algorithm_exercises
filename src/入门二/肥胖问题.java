package 入门二;
import java.util.Scanner;
public class 肥胖问题 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	double m=sc.nextDouble();
	double h=sc.nextDouble();
	double BMI=m/(h*h);
    if(BMI<18.5) {
    	System.out.println("Underweight");
    }
    if(BMI>=18.5&&BMI<24) {
    	System.out.println("Normal");
    }
    if(BMI>=24) {
    	System.out.printf("%.4f\n",BMI);
    	System.out.println("Overweight");
    }
	}

}

