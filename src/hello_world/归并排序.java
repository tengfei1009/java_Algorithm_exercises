package hello_world;

import java.util.Arrays;

public class 归并排序 {
    // 将arr[l...mid]和arr[mid+1...r]两部分进行归并
    private static void merge(Comparable[] arr, int l, int mid, int r) {

        //输入区间是l~r  两个去区间,比如(2,4)
        // 因为是在数组中,对应数的最大值,比数组中要大1

        Comparable[] aux = Arrays.copyOfRange(arr, l, r + 1);

        // 初始化，i指向左半部分的起始索引位置l；j指向右半部分起始索引位置mid+1
        int i = l, j = mid + 1;

        //循环到每一个数
        for (int k = l; k <= r; k++) {

            //如果恰好此处循环到i+1 就改变结果,使得zui
         if (i > mid) {  // 如果左半部分元素已经全部处理完毕

             //k就是对该数组重新排列,从0~r判断到了每一个数
                arr[k] = aux[j - l];
                j++;
            } else if (j > r) {   // 如果右半部分元素已经全部处理完毕
                arr[k] = aux[i - l];
                i++;
            } else if (aux[i - l].compareTo(aux[j - l]) < 0) {  // 左半部分所指元素 < 右半部分所指元素
                arr[k] = aux[i - l];
                i++;
            } else {  // 左半部分所指元素 >= 右半部分所指元素
                arr[k] = aux[j - l];
                j++;
            }
        }
    }
}
