package course36;

public class UseClass {
	public static void main(String[] args) {

		Student st = new Student();

		st.setName("わたべ");
		st.setCourse("高度情報処理科");
		st.setSchool("国際理工");

		st.display();

		Student st2 = new Student();
		st2.setName("ぬまた");
		st2.setCourse("情報システム科");
		st2.setSchool("船橋情報ビジネス専門学校");

		st.display();
		st2.display();

		Kaden kd1 = new Kaden();
		Kaden kd2 = new Kaden();

		kd1.setName("冷蔵庫1");
		kd2.setName("冷蔵庫2");
		kd2.setPrice(10000);

		kd1.display();
		kd2.display();

	}
}
