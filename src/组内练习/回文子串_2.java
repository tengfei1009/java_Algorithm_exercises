package 组内练习;

public class 回文子串_2 {
    public int countSubstrings(String s) {
        int res =0;
        for (int i = 0; i < s.length(); i++) {
            //中心扩散法,中心为一个或者为两个
            res += SubString(s,i,i)+SubString(s,i,i+1);
        }
        return res;
    }
    private int SubString(String str,int l,int r){
        int sum =0;
        while (l>=0&&r<str.length()&&str.charAt(l)==str.charAt(r)){
            l--;
            r++;
            sum++;
        }
        return sum;
    }
}
