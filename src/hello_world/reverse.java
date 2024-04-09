package hello_world;

public class reverse {//reverse  (反转)
	public static void main(String[]args) {
		StringBuilder sb=new StringBuilder("123");
		sb.reverse();
		System.out.println(sb);
		int len=sb.length(); //长度
		System.out.println(len);
	}

}

