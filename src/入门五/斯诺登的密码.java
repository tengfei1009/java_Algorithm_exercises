package 入门五;

import java.util.*;


public class 斯诺登的密码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        ArrayList<Integer> num = new ArrayList();
        int k = 0;
        int mid = 0;
        String m = ("zero one two three four five six seven eight nine ten eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen twenty ");
        String[] s = m.split(" ");  //以空格划分，分成20段

        //双层for循环,筛选出数字数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (arr[i].equals(s[j])) {
                    mid = j * j % 100;
                    num.add(mid);
                    k++;
                    continue;
                }
            }
            if (arr[i].equals("a") || arr[i].equals("a") || arr[i].equals("first") || arr[i].equals("another")) {
                mid = 1;
                num.add(mid);
                k++;
                continue;
            } else if (arr[i].equals("second") || arr[i].equals("both")) {
                mid = 4;
                num.add(mid);
                k++;
            } else if (arr[i].equals("third")) {
                mid = 9;
                num.add(mid);
                k++;
            }
        }
        Collections.sort(num);

//        for (Integer integer : num) {
//            System.out.println(integer);
//        }
        boolean a = false;
        StringBuilder target = new StringBuilder();
        //        System.out.print(mid);
        for (int i = 0; i < num.size(); i++) {
//            首位不能为0
            if (num.get(i) == 0 && !a) {
                continue;
            }
            a = true;
            if (num.get(i) < 10 && target.length() != 0) {
                target.append("0");
            }
            target.append(num.get(i));
        }
        if(target.length()!=0){
            System.out.print(target);
        }else{
            System.out.println(0);
        }
    }
}
