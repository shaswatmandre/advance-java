package in.co.bean;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {

		testadd();

	}

	private static void testadd() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		bean.setId(1);
		bean.setRoll_no("101");
		bean.setName("shaswat");
		bean.setPhysics(68);
		bean.setChemistry(87);
		bean.setMaths(76);

		MarksheetModule m = new MarksheetModule();
		m.add(bean);
	}

}
