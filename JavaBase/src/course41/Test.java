package course41;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//①
		String moji = "模擬テスト。100点取ります";
		System.out.println(moji);

		//②
		int x = 50;
		int y = 100;

		int z = x * y;

		System.out.println(z);

		//③
		Scanner stdIn = new Scanner(System.in);
		System.out.println("文字を入力してください");
		String xx = stdIn.next();
		//④
		for (int a = 1; a <= 5; a++) {
			System.out.println(a);
		}
		//⑤
		System.out.println("数値を入力してください");
		int aa = stdIn.nextInt();
		if (aa > 50) {
			System.out.println("50以上です");
		} else {
			System.out.println("49以下です");
		}
		//⑥	
		boolean isRaining = true;
		if (isRaining == true) {
			System.out.println("傘を持ってケー");
		} else {
			System.out.println("良い１日を!");
		}
		//⑦
		int[] numArr = { 10, 50, 30, 20, 40 };
		//⑧
		for (int aaa = 0; aaa < numArr.length; aaa++) {
			System.out.println(numArr[aaa]);
			//⑨
			int max = 4;
			for (int c : numArr) {
				max = c;
			}
			System.out.println(max);
		}
		//⑩
		System.out.println("数字を入力してください");
		int xxx = stdIn.nextInt();
		int[] variable = { xxx };
		//Ex

		mogi();
		calc(10, 11);
		mojicon("今のところ全問正解でしょ");
	}

	//⑪
	static void mogi() {
		System.out.println("メソッド問題");
	}

	//⑫
	static void calc(int a, int b) {
		System.out.println(a + b);

	}

	//⑬
	static String mojicon(String concated) {
		String sum = concated + "を受け取りました";
		return sum;
	}
}
