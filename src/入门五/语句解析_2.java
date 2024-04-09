package 入门五;

import java.util.Scanner;

public class 语句解析_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.next();
        int a =0 ; int b=0; int c =0;
        //因为都是五位数只需要判断特定的位数,所以用数组存放
        char [] m = s.toCharArray();
        for (int i = 0; i < s.length(); i=i+5) { //这个只循环一次
            if(m[i] == 'a') {
                if(m[i+3] == 'a'){
                    a=a;
                }else if(m[i+3] == 'b') {
                    a=b;
                }else if (m[i+3] == 'c') {
                    a=c;
                }else {
                    a= m[i+3]-'0';
                }
            }else if(m[i] =='b'){
                if(m[i+3]=='a'){
                    b=a;
                }else if(m[i+3] == 'b') {
                    b=b;
                }else if (m[i+3]== 'c') {
                    b=c;
                }else {
                    b=m[i+3] - '0';
                }
            }else if(m[i] == 'c'){
                if(m[i+3]=='a'){
                    c=a;
                }else if(m[i+3] == 'b'){
                    c=b;
                }else if(m[i+3]=='c'){
                    c=c;
                }else {
                    c=m[i+3]-'0';
                }
            }
        }
        System.out.println(a+" "+b+" "+c);
    }
}
