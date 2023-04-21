package in.co.delete;

public class Test_Delete {

	public static void main(String[] args) throws Exception {

		testdelete();

	}

	private static void testdelete() throws Exception {
		DAO_Model dm = new DAO_Model();
		DAO_Delete d = new DAO_Delete();

		d.setId(2);

		dm.delete(d);
	}

}
