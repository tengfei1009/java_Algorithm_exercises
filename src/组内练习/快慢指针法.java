package 组内练习;

public class 快慢指针法 {
//    public static void main (String []args) {
//        int [] arr ={1,2,3,5,3,4};
//        Solution a =new Solution();
//       int s= a.removeElement(arr, 3);
//        System.out.println(s);
//    }
//    static class Solution {
//        public int removeElement(int[] nums, int val) {
//            int size = nums.length;
//            for (int i = 0; i < size; i++) {
//                if (nums[i] == val) {
//                    for (int j = i + 1; j < size; j++) {//五个数，后面的覆盖前面的四次
//                        //刚刚好  j-1就是i  被j覆盖
//                        nums[j - 1] = nums[j];
//                    }
//                    i--;
//                    size--;
//                }
//            }
//            return size;
//        }
//    }
    public static void main (String[]args) {
        int []arr ={1,2,6,5,5,6,5};
        int c=removeElement(arr,5);
        int []arr1=new int[c];
        System.out.println(c);
        for (int i = 0; i < c; i++) {
            System.out.print(arr[i]+" ");
            arr1[i]=arr[i];
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"  ");
        }
    }
    //快慢指针法
    public static int removeElement(int[] nums, int val){
        int slowIndex=0;
        for (int fastIndex=0;fastIndex<nums.length;fastIndex++){//遍历数组
            if (nums[fastIndex] !=val) {
                nums[slowIndex]=nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}
