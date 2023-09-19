package pokekadai;

public class Pocketon {
	//Pocketon1
	String name;
	String type;
	int power;
	int difficult;
	int getted;

	//Pocketon2
	Pocketon(String n, String t, int p, int d) {
		name = n;
		type = t;
		power = p;
		difficult = d;
		getted = 0;
	}

	//Pocketon3
	void display() {
		System.out.print(name);
		System.out.println(type);
		System.out.println(power);
		System.out.println(difficult);
		System.out.println(getted);

	}

}
