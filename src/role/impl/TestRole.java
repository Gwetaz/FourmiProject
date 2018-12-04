package role.impl;

public class TestRole {

	public static void main(String[] args) {
		Role role = new Ouvriere();
		role.genererAge();
		System.out.println(role.getAge());
	}

}
