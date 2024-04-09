package 动态规划;

import java.util.ArrayList;
import java.util.List;

public class 复原IP地址 {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        int n = s.length();
        if (n < 4 || n > 12) {
            return res;
        }

        // 定义动态规划数组 dp，dp[i][j] 表示从字符串的第 0 位到第 i 位组成 j 个有效 IP 地址的所有可能性
        List<String>[][] dp = new ArrayList[n][4];

        // 初始化动态规划数组
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                dp[i][j] = new ArrayList<>();
            }
        }

        // 动态规划的递推过程
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                // 对于第一段 IP 地址
                if (j == 0) {
                    String num = s.substring(0, i + 1);
                    if (isValid(num)) {
                        dp[i][j].add(num);
                    }
                } else {
                    // 对于其他段的 IP 地址
                    for (int k = 0; k < i; k++) {
                        // 判断前面一段 IP 地址是否有结果，并且当前段是有效的 IP 地址段(从k到)
                        if (dp[k][j - 1].size() > 0 && isValid(s.substring(k + 1, i + 1))) {
                            // 将前面一段 IP 地址的结果与当前段组合成完整的 IP 地址，并添加到当前段的结果中
                            for (String str : dp[k][j - 1]) {
                                dp[i][j].add(str + "." + s.substring(k + 1, i + 1));
                            }
                        }
                    }
                }
            }
        }

        // 获取结果，即最后一段 IP 地址的所有可能性
        for (String str : dp[n - 1][3]) {
            res.add(str);
        }

        return res;
    }

    //    Valid: 有效的
    private boolean isValid(String s) {
        // 为0 || 最大为超过三位数 || 第一个为0,并且该字符串的长度比1要大 || 为3位数但是比255大  也不行
        if (s.length() == 0 || s.length() > 3 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }
}
