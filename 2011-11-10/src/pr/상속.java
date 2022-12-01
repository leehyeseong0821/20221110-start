package pr;


class Cal{
	int left, right;
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

class casl extends Cal{
	public void sub() {
		System.out.println(this.left-this.right);
	}
}




public class 상속 {

	public static void main(String[] args) {
		casl c =new casl();
		c.set(20, 10);
		c.sum();
		c.avg();
		c.sub();

	}

}
