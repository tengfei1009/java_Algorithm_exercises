package 暴力枚举;

import java.util.Scanner;

public class 三连击 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //获取到A,B,C的比例
        //随机组合,递归三个数,是否满足条件
        int x = sc.nextInt();
        int y =sc.nextInt();
        int z =sc.nextInt();
        boolean flag = false;
        for(int i = 123;i<=987;i++){
            if(i%z == 0){
                //算出一份是多少
                String c = i +""; //得到C的值,得到ABC中最大三位数
                String a = (i/z) *x+"";  //得到A的值
                String b = (i/z)*y+"";  //得到B的值

                //判断是否包含 1到9所有数字
                if(pd(a,b,c)){
                    //包含
                    flag = true;
                    System.out.println(a+" "+b+" "+c+" ");
                }
            }
        }
        if(!flag){
            System.out.println("No!!!"); //如果没有符合条件的数组,就输出No!!!
        }
    }
    private static boolean  pd(String a,String b,String c){
        String mid = a+b+c;
        for(char i = '1';i<='9';i++){
            if(mid.contains(String.valueOf(i))==false){
                return false;//不包含数字i
            }
        }
        return true;
    }
}
