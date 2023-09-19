package course09;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		System.out.println("入力してね");
		Scanner stdIn = new Scanner(System.in);

		int numnum = stdIn.nextInt();
		if (numnum == 1) {
			switch (numnum) {
			case 1:
				System.out.println("1ですね？");
				break;
			case 2:
				System.out.println("2ですね？");
				break;
			default:
				System.out.println("該当なし");

			}

		}
	}

}
