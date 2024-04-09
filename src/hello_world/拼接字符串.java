package hello_world;
import java.util.Scanner;
public class 拼接字符串 {
	public static void main(String[]args) {
		//1.定义数组
		int[]arr= {123};
		//2.调用方法把数组变成字符串
		String str=arrToString(arr);//int[]arr中arr是数组名.  
		
		//调用时要一一对应,调用形参
		
		
		System.out.println(str);
	}
	
	
	
	public static String arrToString(int[]arr) {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1){        //从0到4五个数  长度为5  5-1=4,表示往里放的最后一个元素
			sb.append(arr[i]);       //如果是往里放的最后一个元素,就成立,反之(else)
		}else{
			sb.append(arr[i]).append(", ");
		}
	}
	sb.append("]");
	return sb.toString();  //sb.toString()  用这个方法将StringBuilder这个容器中的数据变回字符串,再返回调用处
	}

}
