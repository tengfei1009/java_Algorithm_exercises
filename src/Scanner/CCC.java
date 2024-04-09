package Scanner;

import java.util.Scanner;

public class CCC {
    public static void main(String[] args) {
        System.out.println("请输入一个大于二的整数");
        Scanner sc = new Scanner(System.in);
        int shu = sc.nextInt();
        for (int i = 2; i < shu; i++) {
            if(zhishu(i)){
                if(shu % i == 0){
                    System.out.println(i);
                }
            }
        }
    }
    public static boolean zhishu(int number){
        for(int i = 2; i <= number - 1; i++){
            if(number % i == 0) {
                return false;
            }
//88
        }return true;
    }
}
