package pro4;

abstract class ZX{
	int left,right;
	
	public void set(int left,int right) {
		this.left=left;
		this.right=right;
	}
	int _sum() {
		return this.left+this.right;
	}
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum();
		avg();
	}
}
class zsd extends ZX{
	public void sum() {
		System.out.println("+ sum:"+_sum());
	}
	public void avg() {
		System.out.println("+ avg:"+(this.left+this.right)/2);
	}
}
class asdf extends ZX{
	public void sum() {
		System.out.println("- sum:"+_sum());
	}
	public void avg() {
		System.out.println("- avg:"+(this.left+this.right)/2);
	}
}


public class 다형성s {

	public static void main(String[] args) {
		ZX c1= new zsd();
		c1.set(20, 30);
		c1.sum();
		c1.avg();
		
		ZX c3=new asdf();
		c3.set(30, 40);
		c3.sum();
		c3.avg();

	}

}
