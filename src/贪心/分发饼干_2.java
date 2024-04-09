package 贪心;

import java.util.Arrays;

public class 分发饼干_2 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int start = 0;
        int count = 0;
        for (int i = 0; i < s.length && start < g.length; i++) {
            //能够满足
            if(s[i]>=g[start]){
                start++;
                count++;
            }
        }
        return count;
    }
}
