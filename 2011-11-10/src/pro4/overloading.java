package pro4;

class C {
	int l,r;
	int third=0;
	public void set(int l,int r) {
		System.out.println("set(int l, int r)");
		this.l = l;
		this.r = r;
	}
	public void set(int l,int r,int third) {
		System.out.println("set(int l, int r,int third)");
		this.third=third;
		this.set(l, r);
	}

	public void sum() {
		System.out.println(this.l+this.r+this.third);
	}
	public void avg() {
		System.out.println((this.l+this.r+this.third)*2);
	}
}
	class D extends C{
		public void sets() {
			System.out.println((this.l+this.r)/2);
		}
	}



public class overloading {

	public static void main(String[] args) {
		D c1 = new D();
		c1.set(30,40);
		c1.sum();
		c1.avg();
		c1.set(10, 20, 30);
		c1.sum();
		c1.avg();
		

	}

}
