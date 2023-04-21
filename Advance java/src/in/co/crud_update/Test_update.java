package in.co.crud_update;

public class Test_update {

	public static void main(String[] args) throws Exception {

		testupdate();

	}

	private static void testupdate() throws Exception {

		Bean_update b1 = new Bean_update();
		Bean_Model mb = new Bean_Model();

		b1.setId(3);
		b1.setName("Arnav");

		mb.update1(b1);

	}

}
