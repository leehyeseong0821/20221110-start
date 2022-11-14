package pro4;

class Sameas{
	public Sameas() {
		
		this._public();
		this._protected();
		this._default();
		this._private();
	}
	public void _public() {
		System.out.println("public");
	}
	protected void _protected() {
		System.out.println("protected");
	}
	 void _default() {
		System.out.println("default");
	}
	private void _private() {
		System.out.println("private");
	}
	
	
}
class same extends Sameas{
	public same() {
		
		Sameas same1 = new Sameas();
		same1._public();
		same1._protected();
		same1._default();
//		불가 same._private();
		
		this._public();
		this._protected();
		this._default();
//		불가 this._private();
	}
	
}

public class 접근제어1 {

	public static void main(String[] args) {
	
	}

}
