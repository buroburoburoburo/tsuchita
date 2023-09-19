package course10;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("xとyを入力してください");
		System.out.println("xの値");
		int x = stdIn.nextInt();

		System.out.println("yの値");
		int y = stdIn.nextInt();
		if (x > y) {
			System.out.println("xがでかい");
		} else {
			if (x == y) {
				System.out.println("同じ");
			} else {
				System.out.println("yがでかい");

			}
		}
	}

}
