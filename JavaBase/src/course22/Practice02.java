package course22;

import java.util.Arrays;

public class Practice02 {

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
		System.out.println(Arrays.deepToString(arr));

	}

}
