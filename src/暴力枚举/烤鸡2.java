package 暴力枚举;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class 烤鸡2 {
    static int n;
    static int count;
    static StringBuffer ans = new StringBuffer();
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st =new StreamTokenizer(br);
        st.nextToken();
        n = (int)st.nval;
        dfs(0,0,"");
        System.out.println(count);
        System.out.print(ans);
    }
    private static void dfs (int i, int sum, String str){
        //配料的美味程度,每次递归判断是否超过,所需美味程度,如果超过就不用继续往下递归了
        if(sum>n){
            return;
        }
        if(i == 10){//如果达到了十种配料,再筛选十种配料中符合条件的
            if(sum ==n){
                //得到一种方案
                count++;
                //去掉前后空格
                str=str.trim();
                ans.append(str+"\n");
            }
            //最多递归到i=10,然后返回
            return;
        }
        for(int j =1 ;j<=3;j++){
            dfs(i+1,sum+j,str+" "+String.valueOf(j));
        }
    }
}
