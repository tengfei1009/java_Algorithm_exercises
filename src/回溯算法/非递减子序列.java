package 回溯算法;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 非递减子序列 {
    ArrayList<List<Integer>> res = new ArrayList();
    ArrayList<Integer> current = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        current = new ArrayList<>();
        backTracking(nums, 0);
        return res;
    }

    public void backTracking(int[] nums, int step) {
        //子集元素的个数至少要大于等于2(节点是都要取的)
        if (current.size() >= 2) {
            res.add(new ArrayList<>(current));
        }
        //每一层开始遍历之前创建一个去重数组
        Set<Integer> uset = new HashSet<>();//无序,不重复,无索引
        for (int i = step; i < nums.length; i++) {
            if (!current.isEmpty() && current.get(current.size() - 1) > nums[i] || uset.contains(nums[i])) {
                continue;
            }
            uset.add(nums[i]);
            current.add(nums[i]);
            backTracking(nums,  i+ 1);
            current.remove(current.size() - 1);
        }
    }
}
