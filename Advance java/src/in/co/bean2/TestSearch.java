package in.co.bean2;

import java.util.Iterator;
import java.util.List;

//import jdk.nashorn.internal.objects.IteratorResult;

public class TestSearch {
	public static void main(String[] args) throws Exception {

		TestSearch();

	}

	private static void TestSearch() throws Exception {

		SearchData sd = new SearchData();
		SearchBean sb = new SearchBean();

		List l = sd.Search(sb);

		Iterator it = l.iterator();

		while (it.hasNext()) {
			SearchBean bean = (SearchBean) it.next();

			System.out.print(bean.getId()+"\t");
			System.out.print(bean.getRoll_no()+"\t");
			System.out.print(bean.getName()+"\t");
			System.out.print(bean.getPhysics()+"\t");
			System.out.print(bean.getChemistry()+"t");
			System.out.println(bean.getMaths());

		}

	}

}
