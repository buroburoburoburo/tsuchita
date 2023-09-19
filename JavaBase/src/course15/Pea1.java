package course15;

import java.util.Random;
import java.util.Scanner;

public class Pea1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();

		int x = 10000;
		while (x < 10001) {
			int num1 = rnd.nextInt(6) + 1;
			int num2 = rnd.nextInt(6) + 1;
			int num3 = rnd.nextInt(6) + 1;
			System.out.println("チンチロ開始");
			System.out.println("掛け金を入力してください");
			int y = stdIn.nextInt();

			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);

			if (num1 + num2 + num3 == 1) {
				System.out.println("ピンゾロ");
				System.out.println(y * 5);
				if (num1 + num2 + num3 == 2) {
					if (num1 + num2 + num3 == 3) {
						if (num1 + num2 + num3 == 4) {
							if (num1 + num2 + num3 == 5) {
								if (num1 + num2 + num3 == 6) {
									System.out.println("ぞろ目");
									System.out.println(y * 3);

									{

									}
								}
							}
						}
					}
				}
			}
		}

	}

}
