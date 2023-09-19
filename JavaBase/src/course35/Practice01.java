package course35;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		//①
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		if (x >= 50) {
			int y = stdIn.nextInt();
			//呼び出す前に条件を出して、50以上ならyをだす。
			//50以上ならxとyを呼び出して、そうでないならxだけを呼び出す

			calc(x, y);
		} else {
			calc(x);
		}

	}

	static void calc(int x, int y) {
		System.out.println(x + y);

	}

	//②
	static void calc(int x) {
		System.out.println(x * 10);
	}

}
