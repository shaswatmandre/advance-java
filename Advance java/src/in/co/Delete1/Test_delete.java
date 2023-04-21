package in.co.Delete1;

public class Test_delete {

	public static void main(String[] args) throws Exception {
		
		testdelete();
		
	}

	private static void testdelete() throws Exception {
		Bean_Delete b = new Bean_Delete();
		BeanModel_delete bm = new BeanModel_delete();
		
		b.setRoll_no("103");
		
		bm.delete(b);
		
		
		
	}

}
