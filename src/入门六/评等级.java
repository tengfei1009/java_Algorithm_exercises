package 入门六;

import java.util.Scanner;

public class 评等级 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int grade = sc.nextInt();
            int exp = sc.nextInt();
            Rating ra = new Rating(num,grade,exp);
            student(ra);
        }
    }

    public static void student(Rating ra){
        if(ra.getSum()>140 && ra.getZong()>=800){
            System.out.println("Excellent");
        }else{
            System.out.println("Not excellent");
        }
    }
}
