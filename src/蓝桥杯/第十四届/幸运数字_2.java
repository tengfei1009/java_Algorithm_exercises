package 蓝桥杯.第十四届;

import java.util.Scanner;

public class 幸运数字_2 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =10;
        int count =126;
        while (n<2023){
            count++;
            if(lucky(count)){
                n++;
            }
        }
        System.out.println(count);
        sc.close();
    }
    private static boolean lucky(int count){
        String er =Integer.toString(count,2);
        String ba =Integer.toString(count,8);
        String shiliu =Integer.toString(count,16);
        String shi =Integer.toString(count);
        if(check(er,count)&&check(ba,count)&&check(shiliu,count)&&check(shi,count)){
            return true;
        }
        return false;
    }
    private static boolean check(String str,int count){
        int sum =0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='a'&&str.charAt(i)<='f'){
                sum+=str.charAt(i)-'a'+10;
            }else {
                sum+=str.charAt(i)-'0';
            }
        }
        return count%sum==0;
    }
}