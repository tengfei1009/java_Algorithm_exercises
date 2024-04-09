package 入门五;

import java.util.Scanner;

public class 语句解析_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int []arr =new int[3];
        for (int i = 0; i < s.length(); i++) {
            while(i%5==0){
                int temp=s.charAt(i);
                if(s.charAt(i+3)>='a'){
                    arr[temp-'a']=arr[s.charAt(i+3)-'a'];
                }else {
                    arr[temp-'a'] = s.charAt(i+3)-'0';
                }
            }
        }
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}
