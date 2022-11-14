package pro4;


class calss{
	int l,r;
	
	public void set(int l,int r) {
		this.l=l;
		this.r=r;
	}
	
	public void sum() {
		System.out.println(this.l+this.r);
	}

	//부모 클래스
	public int avg() {
		return ((this.l+this.r))/2;
	}
}
	class cs extends calss{
		
		public void sum() {
			System.out.println("실행결과는"+(this.l+this.r)+"입니다.");
		}
	
		//자식 클래스 똑 같은 로직을 가지다.중복을 최대한 제거 해야한다.
		public int avg() {
//			return ((this.l+this.r))/2;
			//현재 class의 부모클래스 super
			System.out.println("실행결과는"+((this.l+this.r))*2+"입니다.");
			return super.avg();
	}
}
public class overridings {

	public static void main(String[] args) {
	
			cs c1= new cs();
			c1.set(40, 50);
			c1.sum();
			c1.avg();
	
	}

}
