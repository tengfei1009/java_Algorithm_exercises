package 蓝桥杯.第十四届;

public class 幸运数字_3 {
    //求一个数字字符串的数位之和
    public static int getSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'f') //如果是a-f
                sum += s.charAt(i) - 'a' + 10;
            else //如果是数字
                sum += s.charAt(i) - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000000; i++) {
            String a2 = Integer.toBinaryString(i); //转为二进制
            String a8 = Integer.toOctalString(i); //转为八进制
            String a16 = Integer.toHexString(i); //转为十六进制
            if (i % getSum(a2) == 0 && i % getSum(a8) == 0 && i % getSum(a16) == 0 && i % getSum("" + i) == 0) {
                count++;
                if (count == 2023) {
                    System.out.println("第 2023 个幸运数字是:" + i);
                    break;
                }
            }
        }
    }
}