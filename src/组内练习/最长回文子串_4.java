package 组内练习;

public class 最长回文子串_4 {
    public String longestPalindrome(String s) {
        if(s==null||s.length()<1){
            return "";
        }
        int start =0,end =0;
        for (int i = 0; i < s.length(); i++) {
            int len1 =expendAroundCenter(s,i,i);
            int len2 =expendAroundCenter(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len>end-start){
                start =i-(len-1)/2;
                end = i+len /2;
            }
        }
        return s.substring(start,end+1);
    }
    private int expendAroundCenter(String str,int left,int right){
        while (left>=0 &&right<str.length() &&str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
