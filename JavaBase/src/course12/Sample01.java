package course12;

public class Sample01 {

	public static void main(String[] args) {
		//鉄板文法
		int i = 0;
		do {
			System.out.println("あああああ");
			i++;
		} while (i < 3);

		int x = 0;
		do {
			if (x < 3) {
				System.out.println("ifとの組み合わせだよ");
			} else if (x == 2) {
				break;

			}
			x++;
		} while (x < 3);

	}

}
