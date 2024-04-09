package 力扣数组.简单;

import java.util.LinkedList;
import java.util.List;

public class _500键盘行2 {
    public static void main(String[] args) {

    }
    public static String[] findWords(String[] words) {
                List<String> list = new LinkedList<>();
                String q = "qwertyuiopQWERTYUIOP";
                String a = "asdfghjklASDFGHJKL";
                String z = "zxcvbnmZXCVBNM";
                int i,j;
                for(i=0;i<words.length;i++) {
                    int len = words[i].length();
                    int one=0,two=0,three=0;//单词字母所在的行数
                    for(j=0;j<len;j++) {
                        String s = words[i].substring(j,j+1);
                        if(q.contains(s)) {
                            one++;
                        }else if(a.contains(s)) {
                            two++;
                        }else if(z.contains(s)) {
                            three++;
                        }
                    }
                    // 如果单词每个字母都在同一行，则添加进list
                    if(one == len || two == len || three == len) {
                        list.add(words[i]);
                    }
                }

                return list.toArray(new String[list.size()]);

            }
        }
