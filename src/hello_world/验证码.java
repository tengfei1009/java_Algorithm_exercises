package hello_world;
import java.util.Random;
public class 验证码 {
	public static void main(String[]args) {
		char[]chs=new char[52];
		for (int i=0;i<chs.length;i++){
		if(i<=25) {
			chs[i]=(char)(97+i);
		}else {
			chs[i]=(char)(65+i-26);
		}
		}
		//定义一个字符串变量
		String result="";
		//随机抽取4次
		//随机抽取数组中的索引
		Random r=new Random();
		for(int i=0;i<4;i++){
		int randomIndex=r.nextInt(chs.length);
		result =result+chs[randomIndex];
		//随机索引,获取对应元素
		}
		int number=r.nextInt(10);
		result=result+number;
		System.out.println(result);
	}

}
