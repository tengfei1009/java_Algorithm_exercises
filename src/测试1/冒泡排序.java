package 测试1;
public class 冒泡排序 {
	public static void main(String[]args) {
		int []arr= {-2,-1,5,4,9,8,6};
		int mid=0;
		for(int i=0;i<arr.length-1;i++) {//五个数遍历四次
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					mid=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=mid;
					
				}
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
