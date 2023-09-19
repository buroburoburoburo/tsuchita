package course54_55;

import course53.Book;

public class BookControll {
	public static void main(String[] args) {

		int[] i = new int[5];

		i[0] = 10;
		i[1] = 11;
		i[2] = 12;
		i[3] = 13;
		i[4] = 14;

		System.out.println(i[3]);

		Book book1 = new Book("明解Java", 1500);
		Book book2 = new Book("ITパスポート", 2500);
		Book book3 = new Book("30時間でマスター", 1200);
		Book book4 = new Book("確かな力", 2800);

		Book[] hondana = new Book[4];
		hondana[0] = book1;

	}
}
