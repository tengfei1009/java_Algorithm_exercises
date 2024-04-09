package 力扣数组.简单;

public class _806写字符串需要的行数 {

    public int[] numberOfLines(int[] widths, String s) {
        int []arr ={1,0};  //前一个表示行数,后一个表示总长度
        //获取到总长度,一共多少行
        int sum =0 ;
        char [] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(arr[1]+widths[chars[i]-97]<=100){
                arr[1]+=widths[chars[i]-97];
            }else {
                arr[0]++;
                arr[1] = widths[chars[i] - 97];  //这个数所占的空间
            }
        }
        return arr;
    }
}
