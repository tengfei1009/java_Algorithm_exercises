package 贪心;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class 最大子数组和 {
    //贪心算法
    public int maxSubArray(int[] nums) {
        int res =Integer.MIN_VALUE;
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            count+=nums[i];
            if(count>res){
                res =count;
            }
            if(count<0){
                count = 0;
            }
        }
        return res;
    }
}
