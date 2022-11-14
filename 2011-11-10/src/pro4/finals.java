package pro4;


class pipi{
	static final double PI = 3.14;
	int left,right;

	public void set(int left,int right) {
		this.left=left;
		this.right=right;
//		pipi.PI=6;바꿀수없다 3.14로 지정되어 있어서
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}



//abstract랑 정반대 상속을 변경/금지하는 규제
public class finals {

	public static void main(String[] args) {
		

	}

}
