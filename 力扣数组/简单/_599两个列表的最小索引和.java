package 力扣数组.简单;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _599两个列表的最小索引和 {
    //public interface  Map<K,V>
            public String[] findRestaurant(String[] list1, String[] list2) {
                int n1 = list1.length, n2 = list2.length; // 获取数组长度
                if (n1 < n2) return findRestaurant(list2, list1); // 如果 list1 的长度小于 list2 的长度，则调用 findRestaurant 方法，并交换两个数组的位置

                Map<String, Integer> map = new HashMap<>((int) (n1 / 0.75f)); // 创建一个 HashMap，存储 list1 数组中的元素及其对应的索引
                for (int i = 0; i < n1; ++i) {
                    map.put(list1[i], i); // 将 list1 数组中的元素作为键，索引作为值，添加到 map 中
                }

                int cnt = 0, x = Integer.MAX_VALUE; // 初始化计数器 cnt 和最小索引和 x
                for (int i = 0; i < n2 && i <= x; ++i) { // 遍历 list2 数组，同时限制遍历范围不超过最小索引和 x
                    String s = list2[i]; // 获取当前遍历到的 list2 元素
                    if (map.containsKey(s)) { // 如果 map 中存在当前元素
                        int t = map.get(s) + i; // 计算 list1 中对应元素的索引和当前 list2 元素的索引之和
                        if (t <= x) { // 如果和小于等于最小索引和 x
                            if (t < x) { // 如果和小于最小索引和 x
                                x = t; // 更新最小索引和 x
                                cnt = 0; // 重置计数器 cnt
                            }
                            list1[cnt++] = list2[i]; // 将当前 list2 元素放入 list1 数组中，并增加计数器 cnt
                        }
                    }
                }

                return Arrays.copyOf(list1, cnt); // 根据计数器 cnt 截取 list1 数组的前 cnt 个元素，并返回结果数组
            }
        }
