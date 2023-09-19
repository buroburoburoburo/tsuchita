package course53;

public class Practice01 {
	private String InputTitle;
	private int InputPrice;

	public Practice01(String userInputTitle, int userInputPrice) {
		System.out.println("Inouttitle" + userInputTitle);
		System.out.println("InputPrice" + userInputPrice);
		System.out.println("できました");
	}

	public String getInputTitle() {
		return InputTitle;
	}

	public void setInputTitle(String inputTitle) {
		InputTitle = inputTitle;
	}

	public int getInputPrice() {
		return InputPrice;
	}

	public void setInputPrice(int inputPrice) {
		InputPrice = inputPrice;
	}

}
