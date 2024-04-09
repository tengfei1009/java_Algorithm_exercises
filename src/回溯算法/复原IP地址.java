package 回溯算法;

import java.util.ArrayList;
import java.util.List;

public class 复原IP地址 {
    List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        int n = s.length();
        String current = "";
        backTracking(s, 0, current, 0);
        return res;
    }

    public void backTracking(String s, int startIndex, String current, int step) {
        if (startIndex == s.length() && step == 4) {
            res.add(current);
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            String mid = s.substring(startIndex, i + 1);
            if (isValid(mid)) {
                if (step == 3) {
                    backTracking(s, i + 1, current + mid, step + 1);
                } else {
                    backTracking(s, i + 1, current + mid + ".", step + 1);
                }
            }
        }
    }

    private boolean isValid(String s) {
        if (s.length() == 0 || s.length() > 3 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }
}
