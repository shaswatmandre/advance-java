package in.co.bean_update;

public class Test_Bean1 {

	public static void main(String[] args) throws Exception {

		testupdate();

	}

	private static void testupdate() throws Exception {
		
		Bean_1Model b = new Bean_1Model();
		Bean_1 b1 = new Bean_1();
		
		
		b1.setId(3);
		b1.setName("nidhi");
		
		b.update(b1);
		

	}

}
