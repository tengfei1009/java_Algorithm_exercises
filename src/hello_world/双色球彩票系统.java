package hello_world;

import java.util.Random;
import java.util.Scanner;

public class 双色球彩票系统 {
    public static void main(String[] args) {
        //中奖号码
        int[] arr1 = createNumber();

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        //用户输入
        int[] arr2 = inputNumber();


        int red = redpen(arr1, arr2);
        //蓝色中了输出1 没中输出0
        int blue = arr1[6] == arr2[6] ? 1 : 0;

        System.out.println(red + "-----" + blue);

//        //根据红球的个数以及蓝球的个数来判断中奖情况
//        if (red == 6 && blue == 1) {
//            System.out.println("恭喜你，中奖1000万");
//        } else if (red == 6 && blue == 0) {
//            System.out.println("恭喜你，中奖500万");
//        } else if (red == 5 && blue == 1) {
//            System.out.println("恭喜你，中奖3000");
//        } else if (red == 5 && blue == 0) {
//            System.out.println("恭喜你，中奖200");
//        } else if (red == 4 && blue == 0) {
//            System.out.println("恭喜你，中奖10");
//        } else if (red == 2 && blue == 1) {
//            System.out.println("恭喜你，中奖5");
//        } else {
//            System.out.println("谢谢参与，谢谢惠顾");
//        }
    }
    public static int[] inputNumber() {
        //用户输入中奖号码
        int []arr =new int[7];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("请输入"+(i+1)+"个红球号码");
            while (true) {
                int ran = sc.nextInt();
                if(ran>=1&&ran<33){
                    boolean flag =contains(arr,ran);
                    if(!flag) {
                        arr[i]=ran;
                        break;
                    }else {
                        System.out.println("当前红球号码已存在请重新录入");
                    }
                }else {
                    System.out.println("当前红球号码超出范围");
                }
            }
        }
        System.out.println("请输入篮球号码");
        while (true) {
            int blueNumber= sc.nextInt();
            if(blueNumber>=1 &&blueNumber<=16){
                arr[arr.length-1]=blueNumber;
                break;
            }else {
                System.out.println("当前篮球录入超出范围请重新录入");
            }
        }
        return arr;
    }
    public static int[] createNumber() {
        //创建数组添加中奖号码
        int [] arr =new int[7];

        //随机数
        //红球:不能重复 1 2 3 4 5 6
        //篮球:可以和红球号码重复

        //生成红球号码添加到数组中
        Random r =new Random();
        for (int i = 0; i < 6; i++) {
             int redNumber= r.nextInt(33)+1;
             boolean flag=contains(arr,redNumber);
             if(!flag) {
                 arr[i]=redNumber;
             }
        }
        //生成篮球号码
        int blueNumber = r.nextInt(16)+1;
        arr[6]=blueNumber;
        return arr;
    }
    //判断红球是否重复
    public static boolean contains (int []arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    //判断红球个数
    public static int redpen(int []arr1,int []arr2) {
        int k=0;
        //只判断前六个,到第五个索引
        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = 0; j < arr2.length-1; j++) {
                if(arr1[i]==arr2[j]){
                    k++;
                    break;
                }
            }
        }
        return k;
    }
}
