package 力扣数组.简单;

public class _748最短补全词 {
    public static void main(String[] args) {
        System.out.println(shortestCompletingWord("steps", new String[]{"step", "steps", "stripe", "stepple"}));
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        //toLowerCase();
        String str = "";//记录最短
        int len = Integer.MAX_VALUE;
        int[] lic = new int[26];   //记录licensePlate中字母的个数;
        for (int i = 0; i < licensePlate.length(); i++) {
            char c = licensePlate.charAt(i);
            if (c <= 'z' && c >= 'a') {
                lic[c - 'a']++;
            }
            if (c <= 'Z' && c >= 'A') {
                lic[c - 'A']++;
            }
        }

        //记录数组words中的每个字符串中字母的个数,遍历words
        for (String w : words) {
            int[] temp = new int[26];
            for (int i = 0; i < w.length(); i++) {
                char c = w.charAt(i);
                if (c <= 'z' && c >= 'a') {
                    temp[c - 'a']++;
                }
                if (c <= 'Z' && c >= 'A') {
                    temp[c - 'A']++;
                }
            }
            //判断是否为完整词
            boolean check = is(temp, lic);
            //如果是完整词,
            if (check == true) {
                if (w.length() < len) {    //就记录长度和字符串内容,找到最短完整词;
                    len = w.length();
                    str = w;
                }
            }
        }
        return str;
    }
    public static boolean is (int[]arr_1,int []arr_2){
        for (int i = 0; i < 26; i++) {
            if(arr_1[i]<arr_2[i]){
                return  false;
            }
        }
        return true;
    }
}
