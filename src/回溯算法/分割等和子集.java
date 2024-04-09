package 回溯算法;

/**会超时*/
public class 分割等和子集 {
    boolean check = false;
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        bakcTracking(nums,0,sum);
        return check;
    }
    int mid;
    private void bakcTracking (int []nums,int startIndex,int sum){
        if(mid==sum/2){
            check = true;
            return;
        }
        if(mid>sum/2){
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            mid+=nums[i];
            bakcTracking(nums,i+1,sum);
            mid-=nums[i];
        }
    }
}
