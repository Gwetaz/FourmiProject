package etat.impl;

public class TestMain {

	public static void main(String[] args) {
		Etat etatTest = new Oeuf(1);
		System.out.println(etatTest.toString());
		etatTest = ((Oeuf) etatTest).transformation();
		System.out.println(etatTest.toString());
	}

}
