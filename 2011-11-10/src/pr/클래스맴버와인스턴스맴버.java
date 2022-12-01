package pr;


 class Calculatoer{
	 static double PI=3.14;
	 static int base=0;
	 int left,right;
	 
	 
	 public void set(int left, int right) {
		 this.left=left;
		 this.right=right;
	 }
	 public void sum() {
		 System.out.println(this.left+this.right+base);
	 }
	 public void avg() {
		 System.out.println((this.left+this.right)/2);
	 }

 }

public class 클래스맴버와인스턴스맴버 {

	public static void main(String[] args) {
		Calculatoer c1=new Calculatoer();
		Calculatoer c2=new Calculatoer();
		System.out.println(c1.PI);
		System.out.println(c2.PI);
		System.out.println(Calculatoer.PI);
		
		c1.set(10, 20);
		c1.sum();
		c2.set(40, 20);
		c2.sum();
		Calculatoer.base = 20;
		c1.sum();
		c2.sum();
		
	}

}
