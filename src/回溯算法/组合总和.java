package 回溯算法;

import java.util.ArrayList;
import java.util.List;

public class 组合总和 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTracking(candidates, target, 0, 0);
        return res;
    }

    List<Integer> current = new ArrayList<>();
    public void backTracking(int[] candidates, int target, int sum, int start) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            res.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            sum += candidates[i];
            backTracking(candidates, target, sum, i);
            sum -= candidates[i];
            current.remove(current.size() - 1);
        }
    }
}
