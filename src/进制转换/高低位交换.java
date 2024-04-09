package 进制转换;

import java.util.Scanner;

public class 高低位交换 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String num = Integer.toBinaryString(sc.nextInt());
        int length = num.length();
        StringBuilder builder =new StringBuilder();
        for (int i = 0; i < 32 - length; i++) {
            builder.append("0");
        }
        num = builder.append(num).toString();
        num = num.substring(16)+num.substring(0,16);
        int count = 0;
        for (char c : num.toCharArray()) {
            //去掉前面多的0
            if(c!='0'){
                break;
            }
            count++;
        }
        num = num.substring(count);
        System.out.println(Long.parseLong(num,2));//二进制转十进制
    }
}