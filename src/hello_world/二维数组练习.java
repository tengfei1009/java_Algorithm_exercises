package hello_world;

public class 二维数组练习 {
	public static void main(String[]args) {
	int[][]yearARR= {
			{22,66,44},
			{77,33,88},
			{25,45,65},
			{11,66,99},
	};
	//传两个数组,两个数组利用循环分开求和
	for(int i=0;i<yearARR.length;i++) {
		int[] quater=yearARR[i];
		 int sum=Get(quater);
	System.out.println(sum);
	}
	}
	//一维数组
	public static int Get(int[]arr ) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	

}
