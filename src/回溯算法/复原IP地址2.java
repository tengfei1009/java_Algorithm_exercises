package 回溯算法;

import java.util.ArrayList;
import java.util.List;

public class 复原IP地址2 {
    List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        backTracking(s, 0, 0, "");
        return res;
    }

    private void backTracking(String s, int startIndex, int step, String current) {
        if (step == 4 && startIndex == s.length()) {
            res.add(current);
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            String mid = s.substring(startIndex, i + 1);
            if (isValid(mid)) {
                if (step == 3) {
                    backTracking(s, i + 1, step + 1, current + mid);
                } else {
                    backTracking(s, i + 1, step + 1, current + mid + ".");
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
