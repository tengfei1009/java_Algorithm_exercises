package 卡码网;

import java.util.Scanner;

public class A加B问题III {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a!=0&&b!=0){
                System.out.println(a+b);
            }else {
                break;
            }
        }
    }
}
