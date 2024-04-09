package 蓝桥杯;

import java.util.ArrayList;
import java.util.Scanner;

public class 日期识别 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String n = sc.next();
        String []arr = {"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        ArrayList<Integer> array =new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(n.substring(0,3))){
                array.add(i);
                break;
            }
        }
        if(n.charAt(3)==0){
            array.add(Integer.parseInt(n.substring(4)));
        }else {
            array.add(Integer.parseInt(n.substring(3)));
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i)+" ");
        }
    }
}
