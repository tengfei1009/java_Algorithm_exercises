package Scanner;

import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        System.out.println("请输入年份");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println("请输入月份");
        int m = sc.nextInt();

        int month ;
        if ((y % 4 ==0 && y %100 !=0) || y % 400 ==0){
            month =29;
        }else{
            month = 28;
        }
        switch (m){
            case 1 -> System.out.println(31);
            case 2-> System.out.println(month);
            case 3 -> System.out.println(31);
            case 4 -> System.out.println(30);
            case 5 -> System.out.println(31);
            case 6 -> System.out.println(30);
            case 7 -> System.out.println(31);
            case 8 -> System.out.println(31);
            case 9 -> System.out.println(30);
            case 10 -> System.out.println(31);
            case 11-> System.out.println(30);
            case 12-> System.out.println(31);
            default -> System.out.println("没有这个月份");
        }

    }
}
