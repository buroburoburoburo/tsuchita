package course19;

public class Practice02 {

	public static void main(String[] args) {

		System.out.println();
		int[] logicArray = new int[5];
		logicArray[0] = 100;
		logicArray[1] = 50;
		logicArray[2] = 75;
		logicArray[3] = 80;
		logicArray[4] = 65;
		int savepoint = 0;
		for (int i = 0; i < 4; i++) {
			if (logicArray[i] > logicArray[i + 1]) {
				savepoint = logicArray[i];
				logicArray[i] = logicArray[i + 1];
				logicArray[i + 1] = savepoint;
			}
		}
		//中身確認用
		for (int i = 0; i < 5; i++) {
			System.out.println(logicArray[i]);

		}
	}
}
