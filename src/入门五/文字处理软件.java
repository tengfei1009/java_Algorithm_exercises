package 入门五;
import java.util.Scanner;
public class 文字处理软件 {
    //操作次数
    static Scanner sc = new Scanner(System.in);
    static int controls = sc.nextInt();
    static String str = sc.next();
    public static void main(String[] args) {
        for (int i = 0; i < controls; i++) {
            switch(sc.nextInt()){
                case 1:
                    one(sc.next());
                    break;
                case 2:
                    two(sc.nextInt(), sc.nextInt());
                    break;
                case 3:
                    three(sc.nextInt(),sc.next());
                    break;
                case 4:
                    four(sc.next());
                    break;
            }
        }
    }
    public static void one(String s){
        str = str+s;	//直接连接字符串
        System.out.println(str);	//输出
    }
    public static void two(int a,int b){
        str = str.substring(a, a+b);
        System.out.println(str);
    }
    public static void three(int a,String s) {
        String s1 = str.substring(0, a);	//将分界点两端分开读取
        String s2 = str.substring(a, str.length());
        str = s1+s+s2;	//暴力连接
        System.out.println(str);
    }
    public static void four(String s){
        System.out.println(str.indexOf(sc.next(s)));
    }
/*
		v:
		for(int x0 = 0;x0<str.length()-s.length();x0++){	//防止越界
			for(int y0 = 0;y0<s.length();y0++){
				if(str.charAt(x0+y0) != s.charAt(y0))continue v;
			}
		System.out.println(x0);
		break;
		}
*/
}
