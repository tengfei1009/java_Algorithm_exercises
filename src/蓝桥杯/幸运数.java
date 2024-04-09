package 蓝桥杯;

public class 幸运数 {
    public static void main(String[] args) {
        int count = 0;
        for (int num = 11; num <= 100000000; num++) {
            if (isLuckyNumber(num)) {
                count++;
            }
        }
        System.out.println("共有 " + count + " 个不同的幸运数字。");
    }

    public static boolean isLuckyNumber(int num) {
        String digits = String.valueOf(num);
        int length = digits.length();
        int half = length / 2;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < half; i++) {
//            Character.getNumericValue(char ch) 是Java中的一个方法，用于获取指定字符的数值。它可以将表示数字的字符转换为对应的数值。
            sum1 += Character.getNumericValue(digits.charAt(i));
            sum2 += Character.getNumericValue(digits.charAt(i + half));
        }
        return sum1 == sum2;
    }
}
