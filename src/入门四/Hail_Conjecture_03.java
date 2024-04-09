package 入门四;

import java.util.ArrayList;
import java.util.Scanner;

//冰雹
public class Hail_Conjecture_03 {
    public static void main (String[]args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();

        ArrayList<Integer> list =new ArrayList<>();
        list.add(a);
        while(a!=1){
            //如果是奇数
            if(a%2!=0){
                a=a*3+1;
            }else {
                a/=2;
            }
            list.add(a);
        }
        //最大索引小于个数数字
        for(int i=list.size()-1;i>=0;i--){
            int num= list.get(i);
            System.out.print(num+" ");
        }
    }
}
