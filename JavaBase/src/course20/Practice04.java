package course20;

public class Practice04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		int a = 333;
		int sum = 0;
		for (int x : num) {
			sum = a - x;
		}
		System.out.println(sum);
	}

}
