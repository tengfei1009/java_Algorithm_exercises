package 入门六;
import java.util.Scanner;

public class 距离函数2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();

            double distance1 = calculateDistance(x1, y1, x2, y2);
            double distance2 = calculateDistance(x2, y2, x3, y3);
            double distance3 = calculateDistance(x3, y3, x1, y1);

            double perimeter = distance1 + distance2 + distance3;

            System.out.printf("%.2f", perimeter);
        }

        private static double calculateDistance(double x1, double y1, double x2, double y2) {
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }
}
