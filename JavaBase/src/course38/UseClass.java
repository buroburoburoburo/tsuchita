package course38;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {

		Pocketon poke1 = new Pocketon();
		//③
		poke1.name = "銭カメ";
		poke1.power = 100;
		poke1.difficult = 1;
		//④
		String[] arr2 = { "あ", "か", "さ" };

		for (int a = 0; a < 3; a++) {
			System.out.println(arr2[a]);
		}
		//⑤
		Pocketon[] myPockes = new Pocketon[3];

		myPockes[0] = poke1;
		//⑥		
		Pocketon poke2 = new Pocketon();
		poke2.name = "不思議リーフ";
		poke2.power = 200;
		poke2.difficult = 3;
		//⑦
		myPockes[1] = poke2;
		//⑧
		System.out.println(myPockes[0].name);

		//⑨
		System.out.println(myPockes[1].difficult);

		//⑩
		Pocketon poke3 = new Pocketon();
		Scanner stdIn = new Scanner(System.in);
		System.out.println("名前を入力してね");
		poke3.name = stdIn.next();
		System.out.println("パワーを入力してね");
		poke3.power = stdIn.nextInt();
		System.out.println("数値を入力してね");
		poke3.difficult = stdIn.nextInt();
		myPockes[2] = poke3;

		//⑪
		System.out.println(myPockes[2].name);
		System.out.println(myPockes[2].power);
		System.out.println(myPockes[2].difficult);
		//⑫
		for (int aa = 0; aa < myPockes.length; aa++) {
			System.out.println(myPockes[aa].name);
		}
		//⑬
		myPockes[1].display();

	}
}
