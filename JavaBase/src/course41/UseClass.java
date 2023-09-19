package course41;

public class UseClass {

	public static void main(String[] args) {
		Product pro1 = new Product();
		//⑮
		pro1.no = "A001";
		pro1.name = "Item1";
		pro1.price = 200;
		pro1.quantity = 10;
		//16
		pro1.display();
		Food fd = new Food();
		fd.name = "ハンバーガー";
		fd.price = 100;
	}

}
