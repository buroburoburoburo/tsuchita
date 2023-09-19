package course21;

import java.util.Scanner;

public class ArrQuestion {

	public static void main(String[] args) {
		int[] typhoon = new int[12];
		typhoon[0] = 1;
		typhoon[1] = 1;
		typhoon[2] = 0;
		typhoon[3] = 0;
		typhoon[4] = 0;
		typhoon[5] = 1;
		typhoon[6] = 4;
		typhoon[7] = 5;
		typhoon[8] = 6;
		typhoon[9] = 4;
		typhoon[10] = 6;
		typhoon[11] = 1;
		System.out.println("7月の台風発生件数は" + typhoon[6] + "件です");
		int a = 1;
		while (a < 12) {
			for (int i : typhoon) {
				System.out.println(a++ + "月の台風発生件数は" + i);
			}

			int[] quake = new int[12];
			quake[0] = 153;
			quake[1] = 127;
			quake[2] = 130;
			quake[3] = 109;
			quake[4] = 118;
			quake[5] = 164;
			quake[6] = 130;
			quake[7] = 103;
			quake[8] = 103;
			quake[9] = 104;
			quake[10] = 123;
			quake[11] = 141;
			int b = 1;
			while (b < 12) {
				for (int ii : quake) {
					System.out.println(b++ + "月の地震発生件数は" + ii);
				}
			}
			int[] rain = new int[12];
			rain[0] = 20;
			rain[1] = 58;
			rain[2] = 107;
			rain[3] = 87;
			rain[4] = 114;
			rain[5] = 187;
			rain[6] = 200;
			rain[7] = 59;
			rain[8] = 169;
			rain[9] = 441;
			rain[10] = 158;
			rain[11] = 94;
			int c = 1;
			while (c < 12) {
				for (int iii : rain) {
					System.out.println(c++ + "月の降水量は" + iii);

				}

				Scanner stdIn = new Scanner(System.in);
				System.out.println("どの情報が見たいですか？");
				int f = stdIn.nextInt();
				if (f == 1)
					System.out.println("地震発生件数");
				if (f == 2)
					System.out.println("台風発生件数");
				if (f == 3)
					System.out.println("降水量");
				System.out.println("年別か月別");
				System.out.println("1.年別" + "2.月別");
				int g = stdIn.nextInt();
				if (g == 1)
					System.out.println("年別");
				if (g == 2)
					System.out.println("月別");

				int h = stdIn.nextInt();
				if (h == 1) {
					if (h == 1) {
						//台風の年別を選んだ場合
						int sum = 0;
						for (int i = 0; i < typhoon.length; i++) {
							sum = sum + typhoon[i];
						}
						System.out.println("1年間に起こった台風の総件数は" + sum + "件です。");
						//台風の月別を選んだ場合
						System.out.println("見たい月を入力してください。");
						int j = stdIn.nextInt();
						System.out.println(j + "月の台風件数は" + typhoon[j - 1] + "です。");
						if (h == 2) {
							if (h == 2) {
								if (h == 3) {
									if (h == 3) {
										//地震の年別を選んだ場合
										System.out.println();
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