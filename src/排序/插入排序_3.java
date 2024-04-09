package 排序;

import java.util.Arrays;

public class 插入排序_3 {
    //八万个数据大概需要执行4~5s
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1, -1, 89};
        insertSort(arr);
    }

    //插入排序
    public static void insertSort(int[] arr) {
        int insertVal =0;
        int insertIndex =0;
        //使用逐步推导的方式来讲解,便利理解
        //分为有序列表和无序列表,将无序列表插入有序列表
        for (int i = 1; i < arr.length; i++) {
            //定义待插入的数
            insertVal = arr[i];
            insertIndex = i - 1; //待插入的前一个下标
            //当待插入的数,小于有序列表中的数时.最多这个数放到0的前面,也就是放到insertIndex = -1的后面一个位置
            /**这个地方运算符小于改成大于,就是插入比有序表中大的,也就是从大到小排列了,别的地方不用改*/
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                //有序列表中的数向后挪一位
                arr[insertIndex + 1] = arr[insertIndex];
                //继续判断,是否在当前有序列表的前面,只要插入元素一直小于有序数组中的元素,就一直--
                //移动到当前有序列表的前一个数,判断前一个数是否大于0(因为在有序列表中这个数就是被替换的数最小只能是0,比0小不行)
                insertIndex--;
            }
            //当前有序列表数,被替换,此时插入到表中了一个数
            //这里我们判断是否需要赋值,如果位置不变就不需要赋值,不加这个判断也行
            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }
            System.out.println("第" + i + "轮插入");
            System.out.println(Arrays.toString(arr));
        }
    }
}
