package pr;

class Calc{
	int left,right;
	public Calc() {}
	
	public Calc(int left,int right) {
		this.left= left;
		this.right=right;
	}
	
	
	public void set(int left,int right) {
		this.left=left;
		this.right=right;
	}
	
	public void sum() {
		System.out.println(left+right);
	}
	
	public void avg() {
		System.out.println((left+right)/2);
	}
}
	class asd extends Calc{
		public asd(int left, int right) {
			super(left,right);
		}
		
		
		public void sub() {
			System.out.println(this.left-this.right);
		}
	}



public class 상속과생성자1 {

	public static void main(String[] args) {
		 asd c1= new asd(10,20);
		 c1.avg();
		 c1.sub();
		 c1.sum();
		 System.out.println();
		 Calc c2=new Calc();
		 c2.set(20, 30);
		 c2.sum();
		 c2.avg();
		 

	}

}
