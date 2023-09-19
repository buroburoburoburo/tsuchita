package course10;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int x = stdIn.nextInt();

		int num = x % 2;
		System.out.println("奇数");

	}

}
