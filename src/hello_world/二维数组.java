package hello_world;

public class 二维数组 {
	public static void main(String[]args) {
	int [][] arr= {
			{1,2,3},
			{4,5,6,7,}
	};
	//外循环:遍历二维数组,得到里面的每一个一维数组
	for(int i=0;i<arr.length;i++){
		//i:表示二维数组中的每一个索引
		//arr[i]:表示二维数组中的每一个元素(一维数组)
		//内循环:遍历一维数组,得到里面的每一个元素
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	}

}
