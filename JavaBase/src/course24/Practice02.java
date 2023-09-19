package course24;

public class Practice02 {
	public static void main(String[] args) {
		moji("引数だよー");
		niko(50, 40);
		bai(30);
	}

	static void bai(int x) {
		System.out.println(x * 2);
	}

	static void moji(String y) {
		System.out.println(y);
	}

	static void niko(int xx, int yy) {
		System.out.println(xx + yy);
	}

	int tensu = 100;

	static void calledMethod(int tensu) {
		System.out.println("引数で受け取った値は" + tensu + "です");

	}
}
