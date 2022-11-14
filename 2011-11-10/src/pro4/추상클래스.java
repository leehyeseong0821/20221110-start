package pro4;


abstract class Calculatorf{
	int left,right;
	
	public void set(int left,int right) {
		
		this.left=left;
		this.right=right;
	}
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum();
		avg();
	}
	
}
	class CalculatorDecoplus extends Calculatorf{
		public void sum() {
			System.out.println("+sum :"+(this.left+this.right));
		}
		public void avg() {
			System.out.println("+avg :"+(this.left+this.right)/2);
		}
	}
	class CalculatorDecoMinus extends Calculatorf{
		public void sum() {
			System.out.println("+sum :"+(this.left-this.right));
		}
		public void avg() {
			System.out.println("+avg :"+(this.left+this.right)/2);
		}
		
	}
	



//상속을 강제하기 위한 것. 즉 부모 클래스에는 메소드의 시그니처만 정의해놓고 그 메소드의 실제 동작 방법은 이메소드를 상속 받은 하위클래스의 책임으로 위임
public class 추상클래스 {

	public static void main(String[] args) {
		CalculatorDecoplus c1 = new CalculatorDecoplus();
		c1.set(20, 40);
		c1.sum();
		c1.avg();
		System.out.println();
		CalculatorDecoMinus c2 =  new CalculatorDecoMinus();
		c2.set(40, 50);
		c2.sum();
		c2.avg();

	}

}
