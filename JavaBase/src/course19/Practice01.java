package course19;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		//なれよう問題１
		String[] mygroup = new String[3];
		mygroup[0] = "大澤";
		mygroup[1] = "鹿島";
		mygroup[2] = "杉本";
		//なれよう問題２
		int[] mygroupnum = new int[3];
		mygroupnum[0] = 5;
		mygroupnum[1] = 9;
		mygroupnum[2] = 13;
		//なれよう問題３
		int[] a = new int[3];
		a[0] = 10;
		a[1] = 50;
		a[2] = a[0] + a[1];

		int[] myNumScan = new int[3];
		myNumScan[0] = 10;
		Scanner stdIn = new Scanner(System.in);
		myNumScan[1] = stdIn.nextInt();
		myNumScan[2] = myNumScan[0] + myNumScan[1];
		System.out.println(myNumScan[2]);

	}

}