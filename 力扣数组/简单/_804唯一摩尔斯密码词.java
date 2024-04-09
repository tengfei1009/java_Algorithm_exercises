package 力扣数组.简单;

import java.util.HashSet;
import java.util.Set;

public class _804唯一摩尔斯密码词 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] dic = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set =  new HashSet();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<word.length(); i++) {
                sb.append(dic[word.charAt(i)-'a']); //获取到字母对应的莫斯密码
            }
            set.add(sb.toString()); //将一个单词拼接,因为set不能有重复,所以如果有相同序列,则无法插入
        }
        return set.size();  //返回set的长度
    }
}
