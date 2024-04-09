package hello_world;

public class 数字反转 {
	public static void main(String[]args){
		//定义数组存储数据
		int[]arr= {1,2,3,4,5};
		//利用循环交换数据
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
			//交换变量i和变量j指向的元素
			int temp=arr[i];
			arr[i]=arr[j];//循环
			arr[j]=temp;//循环
		}
	for (int i=0;i<arr.length;i++) {
	
		System.out.print(arr[i]+" ");
	}
	}

	
}
