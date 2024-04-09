package hello_world;
import java.util.Random;
public class 一到一百随机数 {
	public static void main(String[]args) {
		int[]arr=new int[10];
		//生成随机数
		Random r=new Random();
		for(int i =0;i<arr.length;i++){  //索引,抽取十个数
			int number=r.nextInt(100)+1;//范围0~99然后再加一就是在1~100获取随机数
			arr[i]=number;
			System.out.println(number);
			//定义求和变量
		}
		int a=0;
		//循环得到每一个元素并把每一个元素添加到sum当中
		for(int i=0;i<arr.length;i++) {
			 a=a+arr[i];
		}
		System.out.println("数据中所有的和为"+a);
		 int b=(a/arr.length);
		 System.out.println("数组中的平均数是"+b);
		 int count=0;
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		count++;
		 }
		 System.out.println("有"+count+"个数据比平均数小");
	}

}
