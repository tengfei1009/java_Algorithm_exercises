package 排序;

import java.util.Arrays;

public class 选择排序_2 {
    //八万个数据大概需要执行2~3s
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, -2};
        selectSort(arr);
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }

    //选择排序
    //选择排序时间复杂度是O(n²)
    public static void selectSort(int[] arr) {
        //使用逐步推导的方式来,讲解选择排序
        //总共五个数就执行四次
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            //这个内循环会一直搜索,从当前数的下一个开始找,一直找到最后一个如果发现比现在还小的就替换,一直替换到最后一个
            for (int j = i + 1; j < arr.length; j++) {
                /**将这个条件写反(大于号换小于号),求的就是从大到小的值*/
                if (min > arr[j]) { //说明假定的最小值,并不是最小
                    min = arr[j];
                    minIndex = j;
                }
            }
//            找到可以交换的最小值并不是第一个数,因为第一个数相当于没有动,就不交换
            if (minIndex != i) {
                //当前索引存放最小值  找到最小值的索引存放当前值
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
            System.out.println("第" + (i + 1) + "轮后~~");
            System.out.println(Arrays.toString(arr));
        }
    }
}
