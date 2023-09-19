package course53;

public class BookControll {
	public static void main(String[] args) {

		Book book1 = new Book();

		//Book book2 = new Book("ITワールド");

		Practice01 pra1 = new Practice01("練習", 100);

		System.out.println(pra1.getInputTitle());
		System.out.println(pra1.getInputPrice());

	}
}