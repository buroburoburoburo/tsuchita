package course44;

public class UseClass {

	public static void main(String[] args) {

		Human human = new Human();

		//Humanクラス
		human.setName("システム太郎");
		human.setHobby("プログラミング");
		human.setWeight(60000);

		human.disp();
		human.dispWeight();

		human.disp();
		human.dispWeight();

		human.eat("ハンバーガー", 1200);

		human.dispWeight();

		Animal anim = new Animal();

		anim.setName("サイ");
		anim.setWeight(7000000);
		anim.setKari("角で相手を粉砕する");
		anim.setJumyou(30);
		anim.death(anim.getName());

		anim.display();

	}

}
