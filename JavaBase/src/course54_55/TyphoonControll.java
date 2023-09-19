package course54_55;

import java.util.Scanner;

public class TyphoonControll {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		Typhoon ty1 = new Typhoon(1, "2022.4.8", "マラカス");
		Typhoon ty2 = new Typhoon(2, "2022.4.10", "メーギー");
		Typhoon ty3 = new Typhoon(3, "2022.6.30", "チャバ");
		Typhoon ty4 = new Typhoon(4, "2022.7.1", "アイレー");
		Typhoon ty5 = new Typhoon(5, "2022.7.28", "ソングダー");
		Typhoon ty6 = new Typhoon(6, "2022.7.31", "トローセス");
		Typhoon ty7 = new Typhoon(7, "2022.8.9", "ムーラン");
		Typhoon ty8 = new Typhoon(8, "2022.8.12", "メアリー");
		Typhoon ty9 = new Typhoon(9, "2022.8.22", "マーゴン");

		Typhoon[] typhoonlist = new Typhoon[9];
		typhoonlist[0] = ty1;
		typhoonlist[1] = ty2;
		typhoonlist[2] = ty3;
		typhoonlist[3] = ty4;
		typhoonlist[4] = ty5;
		typhoonlist[5] = ty6;
		typhoonlist[6] = ty7;
		typhoonlist[7] = ty8;
		typhoonlist[8] = ty9;

		System.out.println("変更するなら99、そのままなら0を入力してください");
		int x = stdIn.nextInt();

		if (x == 99) {
			System.out.println("台風名の変更が可能です");
			System.out.println("台風番号何番を変えますか?");
			int henkou = stdIn.nextInt();
			for (int henkoubangou = 0; henkoubangou < henkou; henkoubangou++) {
				System.out.println("変更するので名前を入力してください");
				String henkousuru = stdIn.next();

			}

		} else {
			System.out.println(typhoonlist[0]);
			System.out.println(typhoonlist[1]);
			System.out.println(typhoonlist[2]);
			System.out.println(typhoonlist[3]);
			System.out.println(typhoonlist[4]);
			System.out.println(typhoonlist[5]);
			System.out.println(typhoonlist[6]);
			System.out.println(typhoonlist[7]);
			System.out.println(typhoonlist[8]);

		}

		for (int list = 0; list > 1; list++) {
			System.out.println(typhoonlist[list].getAsiaName());

		}
	}
}
