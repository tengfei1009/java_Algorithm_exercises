package 入门五;

import java.util.Scanner;

public class 手机 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(c=='a'||c=='d'||c=='g'||c=='j'||c=='m'||c=='p'||c=='t'||c=='w'||c ==' '){
                count+=1;                //判断每个需要按1下的字母
            }
            if(c=='b'||c=='e'||c=='h'||c=='k'||c=='n'|| c=='q'||c=='u'||c=='x'){
                count+=2;                //判断每个需要按2下的字母
            }
            if(c=='c'||c=='f'||c=='i'||c=='l'||c=='o'||c=='r'||c=='v'||c=='y'){
                count+=3;                //判断每个需要按3下的字母
            }
            if(c=='s'||c=='z'){
                count+=4;                //判断每个需要按4下的字母
            }
        }
        System.out.println(count);
    }
}
