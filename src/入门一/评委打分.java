package 入门一;
import java.util.Scanner;
public class 评委打分 {
	public static void main (String[]args){
		
		//遍历数组
		int []scoreArr=getScores();
		for(int i=0;i<scoreArr.length;i++) {
			System.out.println(scoreArr[i]);
		}
		
		
		//求出数组中的最大值
		int max =getMax(scoreArr);
		//求出数组中的最小值
		int min=getMin(scoreArr);
		//求出数组中6个分数的总和
		int sum=getSum(scoreArr);
		//(总和-最大值-最小值)/4
		int avg =(sum-max-min)/(scoreArr.length-2);
		System.out.println("选手的最终得分是"+avg);
	}
	
	public static int getMax(int[]scoreArr) {
		int max=scoreArr[0];
		for(int i=0;i<scoreArr.length;i++) {
			if(scoreArr[i]>max) {
				max=scoreArr[i];
			}
		}
		return max;
	}
	
	public static int getMin(int[]scoreArr) {
		int min=scoreArr[0];
		for(int i=0;i<scoreArr.length;i++) {
			if(scoreArr[i]<min) {
				min=scoreArr[i];
			}
		}
		return min;
	}
	
	public static int getSum(int[]scoreArr){
		int sum=0;
		for(int i=0;i<scoreArr.length;i++) {
		sum=sum+scoreArr[i];
	    }
	return sum;
	}
	
public static int[] getScores(){
	int[] scores=new int[6];
	//键盘录入数组
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<scores.length;) {
		System.out.println("请输入评委的打分");
		int score=sc.nextInt();
		if(score>=0&&score<=100) {
			scores[i]=score;
			i++;
		}else {
			System.out.println("成绩超出了范围,继续录入,当前的i为:"+i);
		}
	}
	return scores;
}
}
