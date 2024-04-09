package 贪心;

import java.util.Arrays;

/**
 * 局部最优推出全局最优
 */
public class 分发饼干 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int j = 0; // 饼干数组的索引
        for (int i = 0; i < g.length; i++) {
            while (j < s.length) {
                if( s[j]>= g[i]){
                    break;
                }
                j++; // 找到能满足当前孩子的饼干
            }
            if (j < s.length) {
                res++; // 当前孩子能够得到满足
                j++; // 继续检查下一个饼干
            } else {
                break; // 饼干已经分配完毕，无法继续满足后面的孩子
            }
        }
        return res;
    }
}
