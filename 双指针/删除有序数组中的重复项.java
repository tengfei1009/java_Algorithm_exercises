package 双指针;

public class 删除有序数组中的重复项 {
//    public static void main(String[] args) {
//        int []nums = {1,1,3,3,5,5,6,6};
//        removeDuplicates(nums);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//    }

    //快慢指针法,将相邻相同元素当做一个show慢指针指向同一个索引,当快指针指向与慢指针指向不同时,慢索引指向下一个索引
    //找出与1不相同的,找到后,将第二个元素赋值为与1不相同的数,再找与第二个元素不相同的数,然后慢指针指向第三个元素,再找与第三个不相同的元素
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int slow = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[slow]){
                slow++;
                //从0索引开始判断是否重复.如果不重复 则0 索引等于这个数
                nums[slow] = nums[i];
            }
        }
        return slow +1;
    }
}
