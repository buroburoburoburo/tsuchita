package course57;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();
		Player me = new Player();

		me.setGakuryoku(rnd.nextInt(5) + 1);
		me.setKinryoku(rnd.nextInt(5) + 1);
		me.setMitame(rnd.nextInt(5) + 1);
		me.setOmosiro(rnd.nextInt(5) + 1);

		Target koku = new Target();

		koku.setHituyouGaku(rnd.nextInt(11) + 3);
		koku.setHituyouKin(rnd.nextInt(11) + 3);
		koku.setHituyouMita(rnd.nextInt(11) + 3);
		koku.setHituyouOmo(rnd.nextInt(11) + 3);
		for (int tra = 1; tra <= 7; tra++) {
			System.out.println("現在のあなたの筋力は" + me.getKinryoku());
			System.out.println("現在のあなたの学力は" + me.getGakuryoku());
			System.out.println("現在のあなたの見た目は" + me.getMitame());
			System.out.println("現在のあなたの人としゃべる力は" + me.getOmosiro());

			System.out.println("筋トレなら=1,勉強なら２、学力なら３、成形なら４、人としゃべるなら５を入力してね");

			int kyouka = stdIn.nextInt();
			if (kyouka == 1) {
				me.setKinryoku(me.getKinryoku() + 1);
			} else if (kyouka == 2) {
				me.setGakuryoku(me.getGakuryoku() + 1);
			} else if (kyouka == 3) {
				me.setMitame(me.getGakuryoku() + 1);
			} else if (kyouka == 4) {
				me.setOmosiro(me.getOmosiro() + 1);
			}
			int ransu = rnd.nextInt(4);
			if (ransu == 0) {
				System.out.println("告白相手の筋力は" + koku.getHituyouKin());
			} else if (ransu == 1) {
				System.out.println("告白相手の学力は" + koku.getHituyouGaku());

			} else if (ransu == 2) {
				System.out.println("告白相手の見た目は" + koku.getHituyouMita());
			} else if (ransu == 3) {
				System.out.println("告白相手の面白さは" + koku.getHituyouOmo());
			}
		}
		System.out.println("あなたはどの能力で勝負しますか? 1なら筋力。　２なら学力。　３なら見た目。　４ならおもしろさ。");

		int sentaku = stdIn.nextInt();
		if (sentaku == 1) {
			if (me.getKinryoku() > koku.getHituyouKin()) {
				System.out.println("現在のあなたの筋力が" + me.getKinryoku());
			} else {
				System.out.println("Died");
			}
		} else if (sentaku == 2) {
			if (me.getGakuryoku() > koku.getHituyouGaku()) {
				System.out.println("現在のあなたの学力が" + me.getGakuryoku());
			} else {
				System.out.println("Died");
			}
		} else if (sentaku == 3) {
			if (me.getMitame() > koku.getHituyouMita()) {
				System.out.println("現在のあなたの見た目が" + me.getMitame());
			} else {
				System.out.println("Died");
			}
		} else if (sentaku == 4) {
			if (me.getOmosiro() > koku.getHituyouOmo()) {
				System.out.println("現在のあなたの面白さが" + me.getOmosiro());
			}
		} else {
			System.out.println("Died");

		}

	}
}
