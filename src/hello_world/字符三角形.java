package hello_world;
import java.util.Scanner;//导入java.util.Scanner
public class 字符三角形 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		String a=sc.next();
		System.out.printf(" "+" "+"%s",a);
		System.out.println();
		System.out.printf(" "+"%s%s%s",a,a,a);
		System.out.println();
		System.out.printf("%s%s%s%s%s",a,a,a,a,a);
		System.out.println();
	sc.close();
	}
}
