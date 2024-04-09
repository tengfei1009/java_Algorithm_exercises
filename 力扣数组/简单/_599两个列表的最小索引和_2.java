package 力扣数组.简单;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _599两个列表的最小索引和_2 {
    public static void main(String[] args) {
     String  [] list1 = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String [] list2 =  new String []{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(findRestaurant(list1,list2)[0]);
    }
    public  static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> ans = new ArrayList<>();
        int n1 = list1.length, n2 = list2.length;
        int min = Integer.MAX_VALUE; //2147483647
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (list1[i].equals(list2[j])) {
                    if (i + j == min) {
                        ans.add(list1[i]);
                    } else if (i + j < min) {
                        min = i + j;
                        ans.clear();
                        ans.add(list1[i]);
                    }
                }
            }
        }
       // new String[0] //是一种常见的做法，用于创建一个空的目标数组，并在运行时根据结果列表的大小自动调整数组的长度，以容纳所有的元素。这样做可以节省一些额外的空间。
        return ans.toArray(new String[0]); // 将结果列表转换为字符串数组并返回
    }
}
