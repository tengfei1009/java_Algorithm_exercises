package 回溯算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 组合总和II {
    List<List<Integer>> res =new ArrayList<>();
    boolean []used;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        used  =new boolean[candidates.length];
//        填充数组中的元素都设置为false
        Arrays.fill(used,false);
        //重新排序方便去重
        Arrays.sort(candidates);
        backTracking(candidates,target,0,0);
        return res;
    }
    List <Integer>current = new ArrayList<>();
    //用过元素的下标改成true
    public void backTracking(int []candidates,int target,int sum,int startIndex){
        if(sum>target){
            return;
        }
        if(sum == target){
            res.add(new ArrayList<>(current));
            return;
        }
//        就两点，1是当前一个数是否和前一个相同，2是前一个数是否已经被使用了
        for (int i = startIndex; i < candidates.length; i++) {
            if(i>0&& candidates[i] == candidates[i-1] &&!used[i-1]){
                continue;
            }
            sum+=candidates[i];
            current.add(candidates[i]);
            used[i] =true;
            backTracking(candidates,target,sum,i+1);
            sum-=candidates[i];
            current.remove(current.size()-1);
            used[i] = false;
        }
    }
}
