package 入门三;
import java.math.BigInteger;
import java.util.Scanner;
public class 金币 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int k =sc.nextInt();
		//差一个公式就是到底加了几次钱,加n次,就多n的平方个
        int coins=0;
        int days=0;
        int c=1;
        //层数,第二层两个数都是2
        //第三层三个数都是三
        for(int i=1;i<=k;i++) {//一共k层
        	//不管三七二十一,先把一整层都加上
        	coins+=i*i;
        	days+=i;//天数一次加一层的
        	if(days>k) {
        		coins-=i*(days-k);
        		break;
        	}
			}
        System.out.println(coins);
        }

	}

