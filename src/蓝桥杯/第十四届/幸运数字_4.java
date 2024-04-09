package 蓝桥杯.第十四届;

import java.util.Scanner;

public class 幸运数字_4 {
    static int res;
    public static void main(String[] args) {
        int count = 10;
        int n = 126;
        while (count != 2023) {
            n++;
            if (lucky(n)) {
                count++;
            }
        }
        System.out.println(n);
    }

    private static boolean lucky(int count) {
        res =count;
        String shi =count+"";
        String re = Integer.toString(count, 2);
        String ba = Integer.toString(count, 8);
        String shiliu = Integer.toString(count, 16);
        if(check(re)&&check(ba)&&check(shiliu)&&check(shi)){
            return true;
        }
        return false;
    }

    private static boolean check(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'f') {
                sum += str.charAt(i) - 'a' + 10;
            } else {
                sum += str.charAt(i) - '0';
            }
        }
        if(res%sum==0){
            return true;
        }
        return false;
    }
}
