package course33;

public class UseClass {

	public static void main(String[] args) {
		Kaden reizo = new Kaden();
		//Kaden Classでpriveteを設定しているからできない//
		//reizo.name = "冷蔵庫";//
		//reizo.price = 30000;//

		reizo.setName("マウス");

		//getNameをgetterともいう。//

		System.out.println(reizo.getName());
		reizo.setCategory("大型");

		System.out.println(reizo.getCategory());

	}

}
