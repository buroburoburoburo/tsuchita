package course35;

public class Sample01 {

	public static void main(String[] args) {
		calc();

		calc(50, 100);
		calc("こんにちはBOT");

		calc(50);
	}

	static void calc() {

		System.out.println("計算したいときは、引数を２つ渡して");
	}

	//戻り値がないからvoidがある
	static void calc(int a, int b) {
		System.out.println("計算結果は" + (a + b));
	}

	static void calc(String d) {
		System.out.println("渡された文字は" + d + "です");
	}

	static void calc(int aaa) {
		System.out.println("受けっと値は" + aaa);
	}
}
