package course45;

public class Sample01 {

	public static void main(String[] args) {

		int[] numExArr = { 10, 50, 30, 20, 40 };
		int savepoint = numExArr[0];
		numExArr[0] = numExArr[4];

		numExArr[4] = savepoint;

		System.out.println(numExArr[0]);
		System.out.println(numExArr[4]);

	}

}
