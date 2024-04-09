package 回溯算法;

import java.util.ArrayList;
import java.util.List;

public class 电话号码的字母组合 {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        //定义一个字符串数组
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //输入2 ,就迭代2
        int n = digits.length();
        String a = "";
        backTracking(0, n, arr, res, digits, a);
        return res;
    }

    public void backTracking(int step, int n, String[] arr, List<String> res, String digits, String a) {
        if(digits.length() ==0){
            return;
        }
        if (step == n) {
            res.add(a);
            return;
        }
        int mid = digits.charAt(step) - '0';
        //得到输入的数,根据输入的数,添加字符串
        for (int j = 0; j < arr[mid].length(); j++) {
            a += arr[mid].charAt(j);
            backTracking(step + 1, n, arr, res, digits, a);
            a = a.substring(0,a.length()-1);
        }
    }

}
