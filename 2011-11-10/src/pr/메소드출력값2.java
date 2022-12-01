package pr;

public class 메소드출력값2 {

	
	public static String num(int i) {
			if(i==0) {
				return "zero";
			}else if(i==1) {
				return "one";
			}else if(i==2) {
				return "two";
			}
			return "none";
					
	}
	public static String get() {
		return "최진혁";
	}
	public static String get1() {
		return "김진표";
	}
	public static String get2() {
		return "정밀연";
	}
	public static String[] get3() {
		String [] memebers = {"최진혁","김진표","정밀연"};
		return memebers;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(num(0));
		System.out.println(get());
		System.out.println(get1());
		System.out.println(get2());
		String [] members = get3();
		System.out.println(get3()[0]);
	}

}
