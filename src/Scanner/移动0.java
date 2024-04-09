package Scanner;

public class 移动0 {
    public static void main (String[]args) {
        int a = 0;
        int[] arr = {0, 1, 0, 6, 18,56,0,0,1};
        ory(arr, a);
//        int c = ory(arr, a);
//        for (int i = c; i < arr.length; i++) {
//            arr[i] = a;
//        }
//        System.out.println(c);
    }
    public static void ory(int []nums,int a){
        int slow=0;
        for (int fast=0;fast<nums.length;fast++){
            if (nums[fast] !=a){
                nums[slow]=nums[fast];
//                System.out.println(nums[slow]);
                slow++;
            }
        }
        for (int i = slow; i < nums.length; i++) {
            nums[i] = a;
        }
        //遍历数组
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                System.out.print(nums[i] + ",");
            } else {
                System.out.print(nums[i]);
            }
        }
        System.out.print("]");
//        return slow;
    }
}
