package pro4;

abstract class B{
	public abstract int b();
//	본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
//	public abstract int c() {System.out.println("hello");} 이런 로직을 가지면 안된다.
//	추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
	
	public void d() {
		System.out.println("world");
	}
	
}

class J extends B{
	public int b() {
		return 1;
	}
	
}

// 추상

public class Abstract {

	public static void main(String[] args) {
//		B ojb= new B();
		J obj = new J();

	}

}
