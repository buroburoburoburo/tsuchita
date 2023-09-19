package course54_55;

public class Typhoon {
	private int typhoonbango;
	private String hasseibi;
	private String asiaName;

	//デフォルトコンストラクタ
	public Typhoon() {
		System.out.println("台風");

	}

	//引数有りコンストラクタ
	public Typhoon(int name, String hiniti, String namae) {
		this.typhoonbango = name;
		this.hasseibi = hiniti;
		this.asiaName = namae;
		System.out.println("台風が発生した番号" + name + "番目" + hasseibi + "に発生し," + namae + "で起こりました");

	}
	//getter,setter

	public int getTyphoonbango() {
		return typhoonbango;
	}

	public void setTyphoonbango(int typhoonbango) {
		this.typhoonbango = typhoonbango;
	}

	public String getHasseibi() {
		return hasseibi;
	}

	public void setHasseibi(String hasseibi) {
		this.hasseibi = hasseibi;
	}

	public String getAsiaName() {
		return asiaName;
	}

	public void setAsiaName(String asiaName) {
		this.asiaName = asiaName;
	}

}
