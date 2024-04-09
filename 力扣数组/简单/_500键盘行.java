package 力扣数组.简单;

import java.util.ArrayList;
import java.util.List;

public class _500键盘行 {
    public static void main(String[] args) {
        String [] words = {"Hello","Alaska","Dad","Peace"};
        findWords(words);

    }

    public static String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";

        //放一个数组存放结果
        int[] arr = new int[3];

        List<String> list = new ArrayList<>();
        //获取数组中的每一个元素
        for (String element : words) {
//            System.out.println(element);
//            获取到元素后,判断每个元素是否在同一行
            for (int i = 0; i < element.length(); i++) {
                char c = element.charAt(i);
                for (int i1 = 0; i1 < s1.length(); i1++) {
                    char d = s1.charAt(i1);
//                    System.out.println(d);
                    if (c == d || c==d-32) {
                        arr[0]++;
                        break;
                    }
                }
                for (int i2 = 0; i2 < s2.length(); i2++) {
                    char d = s2.charAt(i2);
                    if (c == d || c==d-32) {
                        arr[1]++;
                        break;
                    }
                }
                for (int i3 = 0; i3 < s3.length(); i3++) {
                    char d = s3.charAt(i3);
                    if (c == d || c==d-32) {
                        arr[2]++;
                        break;
                    }
                }

            }

            //如果说全包含，那么就是属于某一行的，就可以打印
            int num = element.length();
            if(num == arr[0] || num == arr[1] || num == arr[2]){
                list.add(element);
            }

        }
        for (String item : list) {
            // 对集合中的每个元素进行相应的操作
            System.out.println(item);
//            System.out.println("没有结果");
        }
        return list.toArray(new String[list.size()]);
    }
}
