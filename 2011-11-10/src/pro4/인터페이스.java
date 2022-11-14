package pro4;


	interface I1{
		public void z();
	}
	interface I2{
		public void x();
	}
	class G implements I1{
		public void z() {}
	}
	class F implements I2{
		public void x() {}
	}
	class E implements I1,I2{
		public void x() {}
		public void z() {}
	}
	interface I3{
		public void z();
	}
	
	interface I4 extends I3{
		public void z();
	}
	
	
	class a implements I3{
		public void x() {}
		public void z() {}
	}


public class 인터페이스 {

	public static void main(String[] args) {
		
	}

}
