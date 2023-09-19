package course29;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Character me = new Character();
		System.out.println("meのパラメータを入力してね");
		Scanner stdIn = new Scanner(System.in);
		System.out.println("名前は?");
		me.name = stdIn.next();
		System.out.println("HPは?");
		me.hp = stdIn.nextInt();
		System.out.println("攻撃は?");
		me.str = stdIn.nextInt();
		System.out.println("dexは?");
		me.dex = stdIn.nextInt();
		System.out.println("giは?");
		me.agi = stdIn.nextInt();
		System.out.println("防御は?");
		me.def = stdIn.nextInt();
		me.viewStatus();
		Character tonari = new Character();
		tonari.name = "BOT";
		tonari.hp = 20000;
		tonari.str = 500;
		tonari.dex = 400;
		tonari.agi = 2000;
		tonari.def = 100;

		tonari.viewStatus();
		me.battle(me, tonari);

	}

}
