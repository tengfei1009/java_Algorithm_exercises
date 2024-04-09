package 回溯算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 组合 {

//    public static void main(String[] args) {
//        List<List<Integer>> res = combine(1,1);
//        System.out.println(res.size());
//    }


    public  List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> arrayLists = new ArrayList<>();
        List<Integer> arr = new ArrayList();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
            dfs(n, k-1, i + 1,arrayLists,arr);
            arr.remove(arr.size()-1);
        }
        return arrayLists;
    }

    public  void dfs(int n, int flag, int startIndex,ArrayList<List<Integer>> arrayLists, List<Integer>arr) {
        //得到了结果
        if (flag == 0) {
            arrayLists.add(new ArrayList<>(arr));
            return;
        }
        for (int i = startIndex; i <= n; i++) {
            // 继续选择下一个数字，flag-1，并从下一个索引开始
            arr.add(i);
            dfs(n, flag - 1, startIndex + 1 ,arrayLists,arr);
            // 回溯，撤销选择，继续尝试其他数字
            arr.remove(arr.size() - 1);
        }
    }
}
