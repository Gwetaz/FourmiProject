package etat.impl;

public class TestMain {

	public static void main(String[] args) {
		Etat etatTest = new Oeuf(1, 2, 3);
		System.out.println(etatTest.toString());
		//etatTest = ((Oeuf) etatTest).transformation();
		System.out.println(etatTest.toString());
	}

}
