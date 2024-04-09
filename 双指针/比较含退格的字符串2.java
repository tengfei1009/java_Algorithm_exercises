package 双指针;

public class 比较含退格的字符串2 {
    public boolean backspaceCompare(String s, String t) {
        int p1 = s.length()-1; //指向s的末尾
        int p2 =t.length() -1; //指向t的末尾   skip:跳过
        int skipS = 0;  //s中需要跳过的字符
        int skipT = 0 ; //t中需要跳过的字符
        while(p1>=0 || p2>=0){  //指针还有指向
            while(p1 >= 0){//长度大于0是前提条件
                if(s.charAt(p1) == '#'){
                    skipS++;
                    p1--; //指针向后移
                }else if(skipS>0){ //需要跳过的字符
                    skipS--;
                    p1--;
                }else {
                    break;  //当前字符不是#也不需要跳过
                }
            }

            while (p2>=0){
                if(t.charAt(p2)=='#'){
                    skipT++;
                    p2--;//指针向后移
                }else if(skipT>0){
                    skipT--;
                    p2--;
                }else {
                    break;
                }
            }
            //判断当前p1与p2元素是否相等
            if (p1 >= 0 && p2 >= 0 && s.charAt(p1) != t.charAt(p2)) {
                return false; // 当前字符不相等，返回 false
            }

            //判断是否有一方先遍历完,如果有一方先遍历完返回false
            if(p1>=0 != p2>=0){
                return false;
            }
            //判断是一个正常单词,无事发生,指针向前移动
            p1--;
            p2--;
        }
        return true;
    }
}
