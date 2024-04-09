package 回溯算法;

import java.util.ArrayList;
import java.util.List;

public class 全排列 {
    List<List<Integer>> res = new ArrayList();
    boolean []used;
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0){
            return res;
        }
        used= new boolean[nums.length];
        backTracking(nums);
        return res;
    }
    ArrayList<Integer> path = new ArrayList();
    private void backTracking(int[] nums) {
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i]){
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            backTracking(nums);
            used[i] = false;
            path.remove(path.size()-1);
        }
    }
}
