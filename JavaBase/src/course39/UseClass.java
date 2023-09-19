package course39;

public class UseClass {

	public static void main(String[] args) {
		Student std1 = new Student();

		std1.name = "土屋";
		std1.no = 18;

		Student std2 = new Student();
		std2.name = "そら";
		std2.no = 2;

		Student[] myfriend = { std1, std2 };

		for (int aa = 0; aa < myfriend.length; aa++) {
			System.out.println(myfriend[aa].name);
		}
	}

}
