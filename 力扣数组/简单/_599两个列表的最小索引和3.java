package 力扣数组.简单;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _599两个列表的最小索引和3 {
    /*
    哈希表
    利用哈希表存储一个数组的元素和下标映射
    然后通过另一个数组中的元素取出判断索引之和的长度

    执行用时：7 ms, 在所有 Java 提交中击败了87.25%的用户
    内存消耗：41.9 MB, 在所有 Java 提交中击败了25.60%的用户
    */

        public String[] findRestaurant(String[] list1, String[] list2) {
            List<String> list = new ArrayList<>();  // 存储结果的列表
            Map<String, Integer> map = new HashMap<>();  // 存储list1中元素和其索引的映射
            int min = Integer.MAX_VALUE, len = list1.length;  // 最小索引和的初始值和list1的长度
            for (int i = 0; i < len; ++i) {
                map.put(list1[i], i);  // 将list1中的元素和其索引加入映射
            }
            len = list2.length;
            for (int i = 0; i < len; ++i) {
                if (map.containsKey(list2[i])) {  // 如果list2中的元素存在于映射中
                    int sum = map.get(list2[i]) + i;  // 计算索引之和
                    if (sum < min) {  // 如果当前索引和小于最小索引和
                        list.clear();  // 清空结果列表
                        min = sum;  // 更新最小索引和为当前索引和
                        list.add(list2[i]);  // 将当前元素加入结果列表
                    } else if (sum == min) {  // 如果当前索引和等于最小索引和
                        list.add(list2[i]);  // 将当前元素加入结果列表
                    }
                }
            }
            return list.toArray(new String[list.size()]);  // 将结果列表转换为字符串数组并返回
        }
    }

/**
    哈希表解法
 class Solution {
 public:
 vector<string> findRestaurant(vector<string>& list1, vector<string>& list2) {
 unordered_map<string,int> mp;
 for(int i=0;i<list2.size();i++)
 mp[list2[i]]=i;
 int sum=INT_MAX;
 vector<string> res;
 for(int i=0;i<list1.size();i++){
 if(mp.count(list1[i])==0) continue;
 int tmp=i+mp[list1[i]];
 if(tmp<sum){
 res.clear();
 sum=tmp;
 res.push_back(list1[i]);
 }
 else if(tmp==sum){
 res.push_back(list1[i]);
 }
 }
 return res;
 }
 };

 * */
