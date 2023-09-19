package pokekadai;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		Trainer trainer = new Trainer();
		Scanner stdIn = new Scanner(System.in);

		System.out.println("名前を設定してください");
		String name = stdIn.next();
		Pocketon poke = new Pocketon("", "", 0, 0);

		int menu;
		do {
			System.out.println("1.捕獲　2.図鑑を見る　3.バトル　99.終了");
			menu = stdIn.nextInt();

			if (menu == 1) {
				System.out.println("捕獲");

				//名前
				System.out.println("ポケモンの名前を入力してください");
				poke.name = stdIn.next();
				System.out.println();

				//タイプ
				System.out.println("炎、水、地面、草はどのタイプですか？");
				poke.type = stdIn.next();
				System.out.println();

				//戦闘力
				System.out.println("パワー入力してください");
				poke.power = stdIn.nextInt();
				System.out.println();

				//捕獲難易度
				System.out.println("捕獲難易度ばどのくらいですか？");
				poke.difficult = stdIn.nextInt();
				System.out.println();

				trainer.capture(poke);

			} else if (menu == 2) {
				trainer.display();
			} else if (menu == 3) {
				System.out.println("対戦するポケモンの名前を入力してください");
				Battle battle = new Battle();

				String namaen = stdIn.next();
				String namaenen = stdIn.next();
				try {
					int muri = 0;
					int muzusungi = 0;
					for (muri = 0; (!(namaen.equals(trainer.myPockes[muri].name))); muri++) {
					}
					Pocketon pocke1 = trainer.myPockes[muri];

					for (muzusungi = 0; (!(namaenen.equals(trainer.myPockes[muzusungi].name))); muzusungi++) {
					}
					Pocketon pocke2 = trainer.myPockes[muzusungi];
					String winner = battle.doBattle(pocke1, pocke2);
					System.out.println("勝者" + winner);

				} catch (Exception e) {
				}
			}

		} while (menu != 99);
	}

}
