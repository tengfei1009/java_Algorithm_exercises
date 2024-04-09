package 入门五;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class 口算练习题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 输入的行数
        char inputChar = ' '; // 上一次输入的运算类型

        List<String> results = new ArrayList<>(); // 存储结果列表

        for (int i = 0; i < n; i++) {
            String input = sc.next(); // 获取输入
            if (input.length() == 1) { // 如果长度为1，则表示是运算类型
                inputChar = input.charAt(0); // 更新运算类型
                int operand1 = sc.nextInt(); // 获取第一个运算数
                int operand2 = sc.nextInt(); // 获取第二个运算数
                String result = handle(inputChar, operand1, operand2); // 进行运算
                results.add(result); // 将结果添加到列表中
            } else { // 如果长度不为1，则表示与上一次运算类型相同
                int operand = Integer.parseInt(input); // 获取运算数
                int operand2 = sc.nextInt(); // 获取第二个运算数
                String result = handle(inputChar, operand, operand2); // 进行运算
                results.add(result); // 将结果添加到列表中
            }
        }

        for (String result : results) {
            System.out.println(result); // 输出运算式及结果
            System.out.println(result.length()); // 输出运算式的总长度
        }
    }

    public static String handle(char operator, int operand1, int operand2) {
        int result = 0;
        String expression = "";
        switch (operator) {
            case 'a':
                result = operand1 + operand2;
                expression = String.format("%d+%d=%d", operand1, operand2, result);
                break;
            case 'b':
                result = operand1 - operand2;
                expression = String.format("%d-%d=%d", operand1, operand2, result);
                break;
            case 'c':
                result = operand1 * operand2;
                expression = String.format("%d*%d=%d", operand1, operand2, result);
                break;
        }
        return expression;
    }
}