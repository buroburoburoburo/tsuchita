package course57;

import java.util.Random;
import java.util.Scanner;

public class kazuate {

	public static void main(String[] args) {

		//1～100までのランダム数値を生成
		Random rnd = new Random();
		//1から100
		int ransu = rnd.nextInt(100) + 1;
		int atari = 1;

		System.out.println("1から100の数値を入力してね");
		//ユーザがキーボードから数値入力
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			int user = stdIn.nextInt();
			if (ransu > user) {
				System.out.println("答えは大きいです");
				atari = atari + 1;

			} else if (ransu < user) {
				System.out.println("答えは小さいです");
				atari = atari + 1;

			} else if (ransu == user) {

				System.out.println(atari + "回目で当たりました");
				break;
			}

		}

	}

}
