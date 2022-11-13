package pro3;

import java.util.Scanner;

public class 실행중에입력 {

	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 while(in.hasNextInt()) {  //숫자면 true 아닌경우 false 반복문 종료
		 System.out.println(in.nextInt()*10000);
	 }
	 in.close();

	}
}
