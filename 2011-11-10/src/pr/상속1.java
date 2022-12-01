package pr;



class sd extends Cal{
	public void gob(){
		System.out.println(this.left*this.right);
	}
}

public class 상속1 {
	

	public static void main(String[] args) {
		
		sd c1= new sd();
		c1.set(10, 20);
		c1.sum();
		c1.avg();
		c1.gob();
			
	}

}
