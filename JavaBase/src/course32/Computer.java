package course32;

public class Computer {
	String name;
	String cpu;
	int memory;
	String gurabo;
	int price;
	int nebikigaku;

	//コンストラクタ
	Computer(String n, String c, int m, String g, int p) {
		name = n;
		cpu = c;
		memory = m;
		gurabo = g;
		price = p;
	}

	int chonebiki(int nebikigaku) {
		return price - (nebikigaku * 3);
	}

	void display() {
		System.out.println(name);
		System.out.println(cpu);
		System.out.println(memory);
		System.out.println(gurabo);
		System.out.println(price);
	}

	int nebiki(int nebikigaku) {
		int x = price - nebikigaku;
		return x;
	}

}
