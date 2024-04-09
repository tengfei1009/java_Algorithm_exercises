package 排序;

import java.text.SimpleDateFormat;
import java.util.Date;

public class 冒泡排序_1 {
    //八万个数据大概需要执行10s
    public static void main(String[] args) {
        int []arr ={3,9,-1,10,-2};
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String data1Str = simpleDateFormat.format(data1);
        System.out.println("排序前的时间是="+data1Str);

        bubbleSort(arr);

        Date data2 = new Date();
        String data2Str = simpleDateFormat.format(data2);
        System.out.println("排序后的时间是="+data2Str);
    }

    //将冒泡排序封装成一个方法
    public static void bubbleSort(int []arr){
        //冒泡排序的时间复杂度O(n²)
        int temp = 0 ;
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    flag = true;
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
            //优化,在前一次排序中没有发生交换,则不需要再判断后面的排序了,直接break
            if(!flag){//在一趟排序中,一次交换都没有发生过
                break;
            }else {
                flag = false; //重置flag,进行下次判断
            }
        }
    }



}
