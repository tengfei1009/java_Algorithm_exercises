package 组内练习;

public class 相向双指针法 {
    public static void main (String[]args) {
        int []nums ={3,5,5,5,4,6};
        int val =5;
        System.out.println(remove(nums,val));;
    }
    public static int remove (int[]nums,int val) {
        int left =0;
        int right=nums.length -1;//右边第一个,也就是最后一个索引
        while (right >=0 && nums[right]==val) right--;//将right移到从右数第一个值不为val的位置
        while (left <= right) {//直到left增加到和right相等为止
            if (nums[left]==val) {
                nums[left] =nums[right];//将val值,覆盖,用右边的覆盖左边相等的val值
                right--;//整体位数少一位
            }
            left++;

            //因为现在最后一位被赋值到前面了.这一步是判断right--后的最后一位是不是val
            while (right >=0 && nums[right]==val) right--;
        }
        return left;//判断出不是val值的有多少位,而且全在前面,也可以遍历left,得到除val剩余的数
//        注:原数组长度不变
    }
}
