package pro4;

class O {
	public void a(int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}
	public void a(String param) {
		System.out.println("문자출력");
		System.out.println("param");
	}
	
}


public class 다형성 {

	public static void main(String[] args) {
		O o = new O();
		o.a(4);
		o.a("one");

	}

}
