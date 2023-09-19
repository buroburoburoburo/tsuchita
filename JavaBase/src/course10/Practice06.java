package course10;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("xとyを入力してください");
		System.out.println("xの値");
		int x = stdIn.nextInt();

		System.out.println("yの値");
		int y = stdIn.nextInt();
		if (x > y) {
			System.out.println("xがでかい！" + "なぜならxは" + x + "でyは" + y + "だから");
		} else {
			if (x < y) {
				System.out.println("yがでかい！" + "なぜならyは" + y + "でxは" + x + "だから");
			}
			{
			}
		}

	}

}
