package pr;

public class 유효범위2 {
	static int i=5;

	static void a() {
		int i=20;
		b();
		System.out.println(i);
	}
	static void b() {
		int i=30;
		System.out.println(i);
	}
	public static void main(String[] args) {
		int i=2;
		a();
		b();

	}

}
