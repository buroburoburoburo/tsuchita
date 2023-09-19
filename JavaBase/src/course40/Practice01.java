package course40;

public class Practice01 {

	public static void main(String[] args) {
		//if文
		//①
		int number = 15;
		if (number > 10) {
			System.out.println("でか!");
		}
		//②
		int age = 20;
		if (age > 18) {
			System.out.println("大人っすね");
		} else {
			System.out.println("キッズだね");
		}
		//③
		int score = 85;
		if (score >= 90) {
			System.out.println("Excellent");
		}
		if (score >= 80 && score <= 90) {
			System.out.println("Good");
		} else {
			System.out.println("勉強しましょう");
		}
		//④

		boolean isRaining = true;

		if (isRaining == true) {
			System.out.println("傘を持ってケー");
		} else {
			System.out.println("良い１日を!");
		}
		//⑤
		int num = 124 % 2;
		if (num == 0) {
			System.out.println("偶数でっせ");
		} else {
			System.out.println("奇数だよ");
		}
		//for文
		//①
		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		//②
		for (int b = 1; b <= 100; b++) {
			if (b % 2 == 0) {
				System.out.println("現在" + b + "回目のループです" + "偶数です");
			} else {
				System.out.println("");
			}
			//3%2=a　　3/2=1・a
		}
		//③
		for (int c = 10; c >= 1; c--) {
			System.out.println(c);
		}
		//④
		for (int d = 1; d <= 100; d++) {
			int sum = 0;
			System.out.println(d + 0);
		}
		//配列
		//①
		int f[] = { 10, 20, 30, 40, 50 };
		System.out.println(f);

		//②
		String cities[] = { "東京", "大阪", "神奈川", "埼玉笑" };

		for (String aaa : cities) {
			System.out.println(f);
		}
		//③
		int numbers[] = { 10, 20, 30, 40, 50 };
		for (int aa = 0; aa < numbers.length; aa++) {
			System.out.println(numbers[aa]);
			//④
			int max = 0;
			for (int h : numbers) {
				max += h;
			}
			System.out.println(max);
		}
		//⑤
		int[] numbers1 = { 11, 20, 31, 40, 51 };
		for (int i : numbers1) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

}
