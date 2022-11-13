package pro3;


class Calculator3{
	
	static double PI =3.14;
	static int base=0;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left +this.right+base);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2+base);
	}
	
}

public class 클래스멤버와인스턴스멤버 {

	public static void main(String[] args) {
		
		Calculator3 c1= new Calculator3();
		System.out.println(c1.PI);
		c1.setOprands(10, 30);
		c1.sum();
		c1.avg();
		Calculator3.base=10;
		c1.sum();
		c1.avg();
		

		

	}

}
