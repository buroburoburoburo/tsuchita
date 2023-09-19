package course25;

public class Practice01 {

	public static void main(String[] args) {

		int z = modoriOne(134, 100);
		System.out.println("合計値は" + z);
	}

	static int modoriOne(int x, int y) {
		int num = x + y;
		return num;
	}

	String moji = modoriTwo("文字！");System.out.println(moji);
}

	static String modoriTwo(String xx) {
		String moji = xx + "を受け取りました";
		return moji;
	}

}
