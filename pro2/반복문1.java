package pro2;

public class 반복문1 {

	public static void main(String[] args) {
		 
		for (int i=0;i<10;i++) {
			if(i==8) {
				break;
			}
			System.out.println("good"+i);
		}
		
		for (int j=0;j<10;j++) {
			if(j==3) 
				continue;
		
			System.out.println("go"+j);
		}

	}

}
