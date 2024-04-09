package 回溯算法;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 全排列2 {
    List<List<Integer>> res=new ArrayList<>();
    LinkedList<Integer> path =new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length==0){
            return res;
        }
        backTracking(nums);
        return res;
    }
    private void backTracking (int []nums){
     if(path.size()==nums.length){
         res.add(new LinkedList<>(path));
         return;
     }
        for (int i = 0; i < nums.length; i++) {
            if(path.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            backTracking(nums);
            path.remove(path.size()-1);
        }
    }
}
