package hello_world;

public class toString {
	public static void main(String[]args) {
		StringBuilder sb=new StringBuilder();
		sb.append("aaa");
		sb.append("bbb");
		sb.append("ccc");
		System.out.println(sb);//aaabbbccc
		String str=sb.toString();
		System.out.println(str);
	}

}
