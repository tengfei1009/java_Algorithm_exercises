package 入门五.扩展;

public class 判断字符串中都是字母字符 {
    public static void main(String[] args) {
        String input = "abcdef";
        boolean allLetters = true;

        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i))) {
                allLetters = false;
                break; // 如果发现有一个非字母字符，就可以退出循环了
            }
        }

        if (allLetters) {
            System.out.println("字符串中的每个字符都是字母字符");
        } else {
            System.out.println("字符串中存在非字母字符");
        }
    }
}
