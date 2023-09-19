package course30;

public class Drink {

	int price;
	String name;

	//コンストラクタを追加
	//コンストラクタはメインクラスでnewをしたときに自動的に発動する。
	Drink(int p, String n) {
		price = p;
		name = n;
	}

	void display() {
		System.out.println("商品目は" + name);
		System.out.println("値段は" + price);
	}

	int calcSum(int x, int y) {
		int sum = x * y;
		return sum;

	}
}
