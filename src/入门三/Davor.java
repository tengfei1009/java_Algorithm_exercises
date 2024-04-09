package 入门三;
import java.util.Scanner;
/*public class Davor {
public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=0;
		int k=0;
		//定义一周筹集多少钱
		int s=n/52;
		//System.out.println(s);
		for(int i=1;i<=100;i++) {
			if(s-7*i<=0) {
				break;
			}
			if((s-7*i)%21==0) {
				x=i;
			}
		}
		k=(s-7*x)/21;
		//System.out.println(x);
		int mid=0;
		if(x<k) {
			mid=x;x=k;k=mid;
		}
		System.out.println(x);
		System.out.println(k);

	}

}*/
import java.util.Scanner;
public class Davor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x,k;
        int sum = n/52;
        for (k=1;;k++){
            for (x=100;x>0;x--){
                if (7*x+21*k==sum){
                System.out.println(x+"\n"+k);
                return;
                }
            }
        }
    }
}