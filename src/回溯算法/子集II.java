package 回溯算法;

import java.util.*;

//优先队列
public class 子集II {
    boolean used = false;
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> current = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums.length == 0) {
            res.add(current);
            return res;
        }
        Arrays.sort(nums);
        backTracking(nums, 0);
        return res;
    }

    private void backTracking(int[] nums, int startInex) {
        res.add(new ArrayList<>(current));
        if (startInex == nums.length) {
            return;
        }
        for (int i = startInex; i < nums.length; i++) {
            //首先去重,前一个没有用过,说明不是一个树上的,如果前一个用过,说明是子树
            if (i > 0 && nums[i] == nums[i - 1] && !used) {
                continue;
            }
            current.add(nums[i]);
            used = true;
            backTracking(nums, i + 1);
            current.remove(current.size() - 1);
            used = false;
        }
    }
}
