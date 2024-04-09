package 蓝桥杯;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class 航班时间 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
            int T = scanner.nextInt();
            scanner.nextLine();// 去除换行符

            for (int i = 0; i < T; i++) {
                // 获取单程的飞行时间
                long time1 = getTime();
                long time2 = getTime();
                // 因为飞机来回飞行时间相同，所以来回时间相加的平均值就是飞行时间
                long t = (time1 + time2) / 2;
                System.out.printf("%02d:%02d:%02d\n", t / 3600, t / 60 % 60, t % 60);
            }
        }

        private static long getTime() throws ParseException {
            String[] split = scanner.nextLine().split(" "); //解析的长度为

            // 时间解析的API SimpleDateFormat
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

            // format.parse(split[0])解析字符串为日期
            Date t1 = format.parse(split[0]);
            Date t2 = format.parse(split[1]);

            int d = 0;
            if (split.length == 3) {
                d = Integer.parseInt(split[2].substring(2, 3));//这个是加一天
            }
            // getTime 得到时间代表的是毫秒数,最后算出时间差
            return d * 24 * 3600 + t2.getTime() / 1000 - t1.getTime() / 1000;
        }
    }