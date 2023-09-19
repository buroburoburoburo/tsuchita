package pokekadai;

import java.util.Random;

public class Trainer {
	String name;
	Pocketon[] myPockes;

	int hiki = 0;

	//Trainerメソッド
	Trainer() {
		name = "";
		myPockes = new Pocketon[6];
	}

	//captureメソッド
	void capture(Pocketon pocke) {
		Random rnd = new Random();
		int hokaku = rnd.nextInt(10) + 1;
		if (pocke.difficult < hokaku) {
			System.out.println("捕獲成功");
			Pocketon pokepoke = new Pocketon(pocke.name, pocke.type, pocke.power, pocke.difficult);
			myPockes[hiki] = pokepoke;

			myPockes[hiki].getted = hiki;
			hiki++;

		} else {
			System.out.println("捕獲できなかった");
		}

	}

	void display() {
		try {
			System.out.println(myPockes[0].name);
			System.out.println(myPockes[1].name);
			System.out.println(myPockes[2].name);
			System.out.println(myPockes[3].name);
			System.out.println(myPockes[4].name);
			System.out.println(myPockes[5].name);
		} catch (Exception e) {
			//Trainer終了

		}
	}
}
