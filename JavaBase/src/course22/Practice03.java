package course22;

public class Practice03 {

	public static void main(String[] args) {
		String[][] arr = new String[3][3];
		arr[0][0] = "o";
		arr[0][1] = "x";
		arr[0][2] = "o";

		arr[1][0] = "x";
		arr[1][1] = "o";
		arr[1][2] = "x";

		arr[2][0] = "o";
		arr[2][1] = "o";
		arr[2][2] = "o";
		int count = 0;
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				System.out.println("現在のカウントは" + arr[i][j]);
				if (arr[i][j].equals("o")) {
					count = count + 1;
				}
				System.out.println();
			}
		}
	}

}
