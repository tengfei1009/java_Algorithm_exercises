package 力扣数组.简单;


import java.util.HashMap;
import java.util.Map;

public class _819最常见单词_2 {
    public static void main(String[] args) {
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        //所有字母转小写
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replace('!',' ').replace('?',' ').replace(',',' ').replace('\'',' ').replace(';',' ').replace('.',' ');
        String [] s  =  paragraph.split(" ");

        //
        Map <String,Integer> map1 = new HashMap<>();
        Map <String,Integer> map2 = new HashMap<>();
        //被禁用的单词放入map1
        for (String str : banned) {
            //键值对形式
            //这种用法通常用于统计或记录某些元素的出现次数或存在与否。通过将元素作为键，可以快速查找和更新对应的值。
            // 在这个例子中，map1 可能被用于记录一些被禁止的字符串及其出现次数。
            //map1 将包含一组由 banned 数组中的字符串构成的键值对，每个键的值都是 1。
            map1.put(str,1);
        }

        //没有禁用的单词放入map2
        for (String str : s) {
            if(!map1.containsKey(str)&&!str.equals("")){  //不包含禁用单词,并且不为空

                //str对应的值,如果没有,赋值默认为0,并且+1,用来统计数量
                map2.put(str, map2.getOrDefault(str,0)+1);

            }
        }

        int max =-1;
        String res = null;  //这个就是出现最多的键
        //获取到map2键集合,找出出现次数最多的不重复元素

        //map2.get(str) 方法获取的是与键 str 关联的值。
        for (String s1 : map2.keySet()) {
            if(map2.get(s1)>max){
                max = map2.get(s1);//找出最大的
            }
            res = s1;
        }
        return res;
    }
}
