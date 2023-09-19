package course10;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("xとｙ+100します");
		System.out.println("xの値");
		int x = stdIn.nextInt();

		System.out.println("yの値");
		int y = stdIn.nextInt();
		System.out.println("x + y =" + (x + y + 100));
	}

}
