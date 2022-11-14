package pro4;


class bx{
	int left,right;
	public void set(int left, int right) {
		this.left=left;
		this.right=right;
	}
	public void dvide() {
		if(right ==0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		try {
			System.out.println("계산결과는");
			System.out.println(this.left/this.right);
			System.out.println("입니다.");
			
		}catch(Exception e) {
			System.out.println("오류가 발생했습니다."+e.getMessage());
			System.out.println(e.toString());
			System.out.println();
			e.printStackTrace();
		}
		System.out.println("divide end");
	}
}
public class 예외처리 {

	public static void main(String[] args) {
		bx c1 = new bx();
		c1.set(1,1);
		try {
		c1.dvide();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
