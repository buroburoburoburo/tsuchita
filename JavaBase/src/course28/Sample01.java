package course28;

public class Sample01 {

	public static void main(String[] args) {

		//インスタンス
		//「hu1」はHumanのインスタンス(実体)
		//インスタンスに対してパラメータを設定する。
		//インスタンスはnew の左
		Human hu1 = new Human();
		hu1.name = "坂本";
		hu1.kotoba = "ラブ＆ピース";

		hu1.hp = 50;
		hu1.neru();

		System.out.println(hu1.name);

		Chr numata = new Chr();
		numata.attack = 400;
		numata.def = 0;
		numata.spd = 60;
		numata.love = 10;
		numata.mp = 20;
		numata.hp = 10;

		Chr kajima = new Chr();
		kajima.attack = 500;
		kajima.def = 400;
		kajima.spd = 200;
		kajima.love = 0;
		kajima.mp = 10;
		kajima.hp = 90;

		kajima.naguru(kajima.attack, numata.def);

	}
}
