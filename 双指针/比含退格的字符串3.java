package 双指针;

public class 比含退格的字符串3 {
    public boolean backspaceCompare(String s, String t) {
        int p1 = s.length()-1;
        int p2 = t.length()-1;
        int skipS = 0;
        int skipT = 0;
        while (p1 >=0 || p2 >=0){
            //有字符
            while(p1>=0){
                if(s.charAt(p1)=='#'){
                    p1--;
                    skipS++;
                }else if(skipS>0){
                    p1--;
                    skipS--;
                }else {
                    break;
                }
            }

            //有字符
            while(p2>=0){
                if(t.charAt(p2)=='#'){
                    p2--;
                    skipT++;
                }else if(skipT>0){
                    p2--;
                    skipT--;
                }else {
                    break;
                }
            }
            //因为执行上面的--可能此时指针已经指向负数了,所以前面加判断
            if(p1>=0 && p2>=0 && s.charAt(p1) != t.charAt(p2)){
                return false;
            }

            //判断,一个小于0,另一个还有剩余
            if(p1>=0 != p2>=0){
                return false;
            }
            p1--;
            p2--;
        }
        return true;
    }
}
