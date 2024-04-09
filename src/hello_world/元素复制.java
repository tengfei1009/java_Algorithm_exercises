package hello_world;

public class 元素复制 {
	public static void main(String[]args) {
	int []arr= {1,2,3,4,5,6};
	//for(int i=0;i<arr.length;i++) {
	//System.out.println(arr[i]);
	//}
	//表示数组长度与老数组一致
	int []newArr=new int[arr.length];//
	for(int i=0;i<arr.length;i++) {
		newArr[i]=arr[i];
		//System.out.println(i);
		}
	//新数组中已经存满元素了
	for(int i=0;i<newArr.length;i++) {
	System.out.println(newArr[i]);	
	}
	}
}

