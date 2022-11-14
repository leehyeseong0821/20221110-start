package pro4;


class Calculator{
	int left,right;
	
	public Calculator(int left,int right) {
		this.left=left;
		this.right=right;
	}

	
	
	public void sets(int left,int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)*3);
	}
}
	class asd extends Calculator{
	  public asd(int left,int right) {
		  super(left, right);
		  //super 부모클래스의미 생성자 left,right값을 주게된다. 첫번째 매개변수 두번째 매개변수값이 super ()안으로 간다.
	  }
	}



public class 상속과생성자1 {

	public static void main(String[] args) {
	asd c1= new asd(10,20);
	Calculator c2= new Calculator(40,50);
	c1.sum();
	c1.avg();
	c1.sets(20, 30);
	c1.sum();
	c1.avg();
	System.out.println();
	c2.sum();
	c2.avg();

	}

}
