package in.co.crud;

public class Test_add {
	public static void main(String[] args) throws Exception {

		testadd();

	}

	private static void testadd() throws Exception {

		Bean_add b1 = new Bean_add();
		Model_add m = new Model_add();
		
		b1.setId(2);
		b1.setRoll_no("102");
		b1.setName("Shruti");
		b1.setPhysics(65);
		b1.setChemistry(87);
		b1.setMaths(94);
		
		m.add(b1);
	}

}
