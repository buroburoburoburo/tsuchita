package course33pair;

public class Practice01 {

	public static void main(String[] args) {
		//①//
		int x = 50;
		int y = 100;

		int z = x * y;
		System.out.println(z);
		//②//

		for (int a = 1; a <= 5; a++) {
			System.out.println(a + "回目のループです");
		}
		//③//
		int[] numArr = { 10, 20, 30, 40, 50 };

		//④//
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}

	}

}
