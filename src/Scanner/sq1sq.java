package Scanner;

import java.util.Scanner;
public class sq1sq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份和月份，中间用空格隔开：");
        int year = sc.nextInt();
        int month = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){//闰年
            if (month == 2) System.out.println(29);
            else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                System.out.println(31);
            else System.out.println(30);
    }
    else
    {
        if (month == 2)
            System.out.println(28);
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println(31);
        else System.out.println(30);
    }
}
}