package 入门六;

import java.util.ArrayList;
import java.util.Scanner;

public class 哥德巴赫的猜想 {
    static ArrayList<Integer> array = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 4; i <= n; i++) {
            //得到一个偶数
            if (i % 2 == 0) {
                //得到其素数集合
                prime(i);
//                boolean found = false; // 标记是否找到满足哥德巴赫猜想的素数对
                for (int j = 0; j < array.size(); j++) {
                    int prime1 = array.get(j);
                    int prime2 = i - prime1;
                    if (is(prime2)) {
                        System.out.println(i + "=" + prime1 + "+" + prime2);
                        break;
                    }
                }
            }
        }
    }

    //得到2~num/2之间的质数
    public static void prime(int num) {

        for (int i = 2; i <= num / 2; i++) {
            if (is(i)) {
                //得到素数集合
                array.add(i);
            }
        }

    }

    //判断是否为素数
    public static boolean is(int num) {
        boolean check = true;
        // 判断当前数字是否有除了1和自身之外的因数
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                check = false; // 存在因数，不是质数
                break;
            }
        }
        return check;
    }
}
