package course06;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		String a = "あいうえお";
		String b = "かきくけこ";
		//例１　変数aとbが等しいか？
		if (a.equals(b)) {
			System.out.println("文字は一緒です。");
		} else {
			System.out.println("違う文字です！");
		}
		//例２　変数aと「さしすせそ」が等しいか
		if (a.equals("さしすせそ")) {
			System.out.println("文字は一緒です");
		} else {
			System.out.println("違うよ！");
			
		Scanner stdIn = new Scanner (System.in);
		
		System.out.println("文字を入力してね");
		String moji =stdIn.next();
		
		//文字列が「国際理工」かどうか判定するif文
		if()
			System.out.println("あなたが打ったのは「国際理工」だ！");
		} else {
			System.out.println("国際理工じゃないなんて");
			
			
			
			
			
			

		}

	}

}
