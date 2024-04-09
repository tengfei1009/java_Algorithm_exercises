package 入门五;

import java.util.Scanner;

public class 数字反转_升级版_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] arr = new String[2];
        if(s.indexOf(".") != -1){
           arr = s.split("\\.");
            turn(arr[0]);
            System.out.print(".");
            turn(arr[1]);
        } else if(s.indexOf("/")!= -1){
            arr =  s.split("/");
            turn(arr[0]);
            System.out.print("/");
            turn(arr[1]);
        } else if(s.indexOf("%")!=-1){
            arr = s.split("%");
            turn(arr[0]);
            System.out.println("%");
        } else {
            turn(s);
        }
    }
    public static void turn (String str){
        boolean flag1 = false;
        boolean flag2 = false;
        String s="";

        //去前面的0
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== '0' && !flag1){
                continue;
            }
            flag1 =true;
            s+=str.charAt(i);
        }
        //
        for(int i =s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0' && !flag2){
                continue;
            }
            flag2=true;
            System.out.printf("%s",s.charAt(i));
        }
        if(str=="" || s==""){
            System.out.print(0);
            return;
        }
    }
}
