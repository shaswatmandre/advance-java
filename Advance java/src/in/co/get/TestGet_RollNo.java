package in.co.get;

public class TestGet_RollNo {

	public static void main(String[] args) throws Exception {

		testget();

	}

	private static void testget() throws Exception {
		DAO_get d = new DAO_get();
		DAO_getModel d1 = new DAO_getModel();

		d.setRoll_no("roll_no");
		d1.getroll_no(d);

	}

}
