package 回溯算法;

import java.util.*;

public class 全排列II {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean []used =new boolean[nums.length];
        backTracking(nums,used);
        return res;
    }

    public void backTracking(int[] nums,boolean []used) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
        }
        //每一层开始遍历之前创建一个去重数组
        Set<Integer> uset = new HashSet<>();//无序,不重复,无索引
        for (int i = 0; i < nums.length; i++) {
            if (uset.contains(nums[i])||used[i]) {
                continue;
            }
            uset.add(nums[i]);
            path.add(nums[i]);
            used[i]= true;
            backTracking(nums,used);
            path.remove(path.size() - 1);
            used[i]= false;
        }
    }
}
