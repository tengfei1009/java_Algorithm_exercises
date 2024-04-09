package 蓝桥杯.第十四届;


public class 幸运数字 {
    static long aaa;
    public static void main(String[] args) {
        int n = 10;
        long count = 126;
        while (n != 2023) {
            count++;
            if (lucky(count)) {
                n++;
            }
        }
        System.out.println(n);
        System.out.println(count);
    }

    private static boolean lucky(long count) {
        aaa=count;
//        System.out.println(aaa);
        long er = Long.parseLong(Long.toString(count,2));
        long ba = Long.parseLong(Long.toString(count,8));
        Long shiliu = Long.parseLong(Long.toHexString(count),16);
        if (check(er) && check(ba) &&  check(shiliu)) {
            return true;
        }
        return false;
    }

    // 检查这个数是否为幸运数字
    private static boolean check(long num) {
        long count = 0;
        while (num != 0) {
            long mid = num % 10;
            count += mid;
            num /= 10;
        }
        return aaa % count == 0;
    }
}