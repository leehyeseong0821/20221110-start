package pro4;


class cala extends Cal{
	public void bang() {
		System.out.println((this.l+this.r)*2);
	}
}



public class 상속2 {

	public static void main(String[] args) {
	cala c1 = new cala();
	c1.set(10, 20);
	c1.bang();
		

	}

}
