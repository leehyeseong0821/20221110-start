package pro3;


class multiCalculator extends Calculator5{
	public void multiCalculator() {
		System.out.println(this.left * this.right);
	}
}


public class 상속1 {

	public static void main(String[] args) {
		 multiCalculator c1 = new multiCalculator();
		 c1.setOprands(10, 20);
		 c1.sum();
		 c1.avg();
		 c1.multiCalculator();

	}

}
