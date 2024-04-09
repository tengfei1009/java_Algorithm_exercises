package 排序;

import java.util.Arrays;

public class 希尔排序 {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        //八万个数据大概需要执行17s(交换法还不如不用这个方法,发现一个交换一个)
//        shellSort(arr);
        //八万个数据大概需要执行1s(交换法还不如不用这个方法,发现一个交换一个)
        shellSort2(arr);
    }

    //使用逐步推导的方式来编写希尔排序
    /**交换法*/
    public static void shellSort(int[] arr) {
        int temp = 0;
        int count =0;

        //    第一层for是考虑怎么分组；第二层考虑对组进行遍历；第三层考虑对每个组的元素遍历
//        就是用类似冒泡的方法插入新元素排序
        for(int gap = arr.length/2;gap>0;gap/=2){
            for (int i = gap; i < arr.length; i++) {
                //遍历各组中所有的元素(共5组,每组有两个元素),步长
                //最后一个条件保证,只交换一次就跳出循环(无论成交与否都只交换一次)
                for (int j = i - gap; j >= 0; j -= gap) {
                    //如果当前元素大于加上步长后的那个元素,说明交换
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println("希尔排序第"+ (++count)+"轮"+Arrays.toString(arr));
        }


//        //希尔排序的第一轮排序
//        //因为第一轮排序,是将10个数据分成了5组
//        int temp = 0;
////        第一个for循环是分组用的 i = 5 是5组（长度除2）的意思，第二个for循环是就拿分组的元素比较，j = i - 5是拿第一组的第一个元素从0开始，j -= 5 是防止索引越界异常的
//        for (int i = 5; i < arr.length; i++) {
//            //遍历各组中所有的元素(共5组,每组有两个元素),步长
//            //最后一个条件保证,只交换一次就跳出循环(无论成交与否都只交换一次)
//            for (int j = i - 5; j >= 0; j -= 5) {
//                //如果当前元素大于加上步长后的那个元素,说明交换
//                if (arr[j] > arr[j + 5]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 5];
//                    arr[j + 5] = temp;
//                }
//            }
//        }
//        System.out.println("希尔排序1轮后"+ Arrays.toString(arr));
//
//        //希尔排序的第二轮排序
//        //因为第2轮排序,是将10个数据分成了5/2 = 2组
//        for (int i = 2; i < arr.length; i++) {
//            //遍历各组中所有的元素(共5组,每组有两个元素),步长 5
//            //最后一个条件保证,只交换一次就跳出循环(无论成交与否都只交换一次)
//            for (int j = i - 2; j >= 0; j -= 2) {
//                //如果当前元素大于加上步长后的那个元素,说明交换
//                if (arr[j] > arr[j + 2]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 2];
//                    arr[j + 2] = temp;
//                }
//            }
//        }
//        System.out.println("希尔排序2轮后"+ Arrays.toString(arr));
    }

    //对交换式的希尔排序进行优化->移位法
    public static void shellSort2(int[]arr){
        int temp = 0;
        int count =0;
        //增量gap,并逐步的缩小增量
        for(int gap = arr.length/2;gap>0;gap/=2){
            //从第gap个元素,逐个对其所在的组进行直接插入排序
            for(int i = gap;i<arr.length;i++){
                int j = i;
                temp = arr[j];
                if(arr[j]<arr[j-gap]){
                    while(j-gap>=0 &&temp<arr[j-gap]){
                        //移动
                        arr[j] = arr[j-gap];
                        j-=gap;
                    }
                    //当退出while后,就给temp找到了插入的位置
                    arr[j]= temp;
                }
            }
        }
        System.out.println("希尔排序第"+ (++count)+"轮"+Arrays.toString(arr));
    }
}
