package pro4;


 class Cal{
	 int l,r;
	 
	 public void set(int l,int r) {
		 this.l = l;
		 this.r = r;
	 }
	 public void sum() {
		 System.out.println(this.l + this.r);
	 }
	 public void avg() {
		 System.out.println((this.l +this.r)/2);
	 }
 }
	class Calsa extends Cal{
		public void clas() {
			System.out.println(this.l - this.r);
		}
	}


public class 상속 {

	public static void main(String[] args) {
		Calsa a1 = new Calsa();
		a1.set(30, 20);
		a1.sum();
		a1.avg();
		a1.clas();
	

	}

}
