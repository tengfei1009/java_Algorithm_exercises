package 双指针;

public class 移除元素3 {
    public int removeElement(int[] nums, int val) {
        int mid = nums.length;
        for (int i = 0; i < mid; i++) {
            if(nums[i] == val){
                //循环,将后一个给前一个
                for(int j = i+1 ; j<mid ;j++){
//                    因为初始化,这个nums[i]就是错误的值,依次用后面的值将错误值覆盖,后面的数就是 i+1 也就是j
//                    所以nums [j-1] = nums[j]   //前面的错误值,被后面的数覆盖
                    nums[j-1] = nums[j];
                }
            }
            i--;  //因为每找出一个错误值,数组的长度减少,也就是最后一个数和倒数第二个数是一样的,直接不需要
            mid--;//记录新数组长度
        }
        return mid;
    }
}
