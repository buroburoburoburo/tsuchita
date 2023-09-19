package course13;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		System.out.println("数値を入力してね。");
		Scanner stdIn = new Scanner(System.in);
		int yy = stdIn.nextInt();
		for (int i = 1; i <= yy; i++) {
			System.out.println(i);
			int y = i % 2;
			if (y == 1) {
				System.out.println("奇数だよ");
			} else {
				System.out.println("偶数だよ");
			}
			if (i >= 100) {
				System.out.println("どれだけ回すの");
			}
		}
	}
}
