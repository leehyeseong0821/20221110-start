package pro3;

class Calculator2{
	int left, right;

							//leftright 매게변수
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
		
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	public class Calculator1 {
		
	public static void main(String[] args) {
	Calculator2 c1 =new Calculator2();
	c1.setOprands(10, 20);
	c1.sum();
	c1.avg();
	Calculator2 c2 =new Calculator2();
	c2.setOprands(20, 40);
	c2.sum();
	c2.avg();
		
		
	 }
	}

}
