package 回溯算法;

import java.util.ArrayList;
import java.util.List;

public class 子集 {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTracking(nums,0,0);
        return res;
    }
    List <Integer> current = new ArrayList<>();
    private void backTracking(int []nums,int startIndex,int step){
        res.add(new ArrayList<>(current));
        if(step==nums.length){
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            current.add(nums[i]);
            backTracking(nums,i+1,step+1);
            current.remove(current.size()-1);
        }
    }
}
