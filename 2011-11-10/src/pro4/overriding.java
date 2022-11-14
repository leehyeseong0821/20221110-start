package pro4;


class Ca{
	int l,r;
	
	public void set(int l,int r) {
		this.l=l;
		this.r=r;
	}
	public void sum() {
		System.out.println(this.l+this.r);
	}
}
	
	class subs extends Ca{
		public void sum() {
			
			System.out.println("실행 결과는 "+(this.l+this.r)+" 입니다.");
		}
		
	}

public class overriding {

	public static void main(String[] args) {
	
		subs s1 =new subs();
		s1.set(20, 30);
		s1.sum();
//		    subs 안에 메소드가 호출 됨.부모 클래스도가지고 있고 자식클래스도 가지고 있는
//			메소드에 재정의해주면 부모클래스가 가지고있는 메소드는 무시된다.
		

	}

}
