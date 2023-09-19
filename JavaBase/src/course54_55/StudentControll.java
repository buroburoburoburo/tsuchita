package course54_55;

public class StudentControll {
	public static void main(String[] args) {

		Student tonari = new Student(14, "鈴木陽哉");
		Student me = new Student(18, "土屋翔太");

		Student[] mymen = new Student[2];
		mymen[0] = tonari;
		mymen[1] = me;

		mymen[0].setName("沼");

		System.out.println(mymen[1].getName());

	}
}
