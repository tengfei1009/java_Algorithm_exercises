package 入门五;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 Character.isLetter(input.charAt(0)) 是一个Java语言中的方法调用，用于判断指定字符是否是一个字母字符。

 Character.isLetter() 方法接受一个字符作为参数，如果该字符是一个字母字符（a-z或A-Z），则返回true；否则返回false。

 在上述代码中，Character.isLetter(input.charAt(0)) 的作用是判断输入字符串input的第一个字符是否是一个字母字符。如果长度为1且是字母，则表示是运算类型。这样可以区分运算类型和运算数。
 */


public class 口算练习题2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 输入的行数
        char inputChar = ' '; // 上一次输入的运算类型

        List<String> results = new ArrayList<>(); // 存储结果列表

        for (int i = 0; i < n; i++) {
            String input = sc.next(); // 获取输入
            if (input.length() == 1 && Character.isLetter(input.charAt(0))) { // 如果长度为1且是字母，则表示是运算类型
                inputChar = input.charAt(0); // 更新运算类型
                int operand1 = sc.nextInt(); // 获取第一个运算数
                int operand2 = sc.nextInt(); // 获取第二个运算数
                String result = handle(inputChar, operand1, operand2); // 进行运算
                results.add(result); // 将结果添加到列表中
            } else { // 否则表示是运算数
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