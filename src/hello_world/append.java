package hello_world;

public class append {
	public static void main(String[]args) {
		StringBuilder sb= new StringBuilder("abc");
		sb.append(1);
		sb.append(2.3);
		sb.append(true);
		System.out.println(sb);//append  (增加)
		int a=1,b=2;
		System.out.printf("%02d:%2d",a,b);//没有0就是补空格
	} 

}
