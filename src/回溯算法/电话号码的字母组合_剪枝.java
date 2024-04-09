package 回溯算法;

import java.util.ArrayList;
import java.util.List;

public class 电话号码的字母组合_剪枝 {
    //全局变量存储结果
    List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return list;
        }
//初始对应所有的数字，为了直接对应2-9，新增了两个无效的字符串""
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};        //迭代处理
        backTracking(numString, digits, 0);
        return list;
    }

    StringBuilder temp = new StringBuilder();

    public void backTracking(String[] numString, String digits, int n) {
        //判断条件
        if (n == digits.length()) {
            list.add(temp.toString());
            return;
        }
        String str = numString[digits.charAt(n) - '0'];
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            backTracking(numString, digits, n + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
