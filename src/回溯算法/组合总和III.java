package 回溯算法;

import java.util.ArrayList;
import java.util.List;


//同层去重,同一层前一个数,包含后面相同数的所有组合,所以后面与前面相同的组合就不用算了,直接去重
public class 组合总和III {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backTracking(k, 1, n, res, path, 0);
        return res;
    }

    //回溯
    public void backTracking(int k, int startIndex, int sum, List<List<Integer>> res, List<Integer> path, int mid) {
        if (path.size() > k || mid > sum) {
            return; // 剪枝，如果当前路径长度大于 k 或当前和大于 sum，直接返回
        }
        if (path.size() == k && mid == sum) {
            res.add(new ArrayList<>(path));
            return;
        }
        // 进行剪枝操作，还需要的元素个数，比如两个，假设总长度为 5，那么最多从 4 开始
        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
            path.add(i);
            backTracking(k, i + 1, sum, res, path, mid + i);
            path.remove(path.size() - 1);
        }
    }
}
