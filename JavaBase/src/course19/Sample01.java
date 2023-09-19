package course19;

public class Sample01 {

	public static void main(String[] args) {
		String a = "大澤";
		String b = "土屋";
		String c = "臼井";
		String d = "鹿島";
		String e = "大関";
		String f = "藤倉";
		String g = "杉本";
		String h = "長縄";
		//配列の鉄板構文
		//[]に事を要素よ呼ぶ。　要素は０から始まる。
		String[] nameList = new String[10];
		nameList[0] = "大澤";
		nameList[1] = "土屋";
		nameList[2] = "臼井";
		nameList[3] = "鹿島";
		nameList[4] = "大関";
		nameList[5] = "藤倉";
		nameList[6] = "杉本";
		nameList[7] = "長縄";

		for (int i = 0; i < 3; i++) {
			System.out.println("俺の友達の名前は" + nameList[i] + "だ。");
		}

	}

}
