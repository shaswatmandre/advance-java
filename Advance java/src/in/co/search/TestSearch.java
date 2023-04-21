package in.co.search;

import java.util.Iterator;
import java.util.List;

public class TestSearch {

	public static void main(String[] args) {
		
		
		testsearch();

	}

	private static void testsearch() {
		SearchBean sb = new SearchBean();
		SearchBeanModel sm = new SearchBeanModel();
		
		List l = sb.Search(sb);
		
		Iterator it = l.iterator();
		
		
		while(it.hasNext()) {
			SearchBean bean = (SearchBean)it.next();
			
			System.out.print(bean.getId()+"\t");
			System.out.print(bean.getRoll_no()+"\t");
			System.out.print(bean.getName()+"\t");
			System.out.print(bean.getPhysics()+"\t");
			System.out.print(bean.getChemistry()+"\t");
			System.out.println(bean.getMaths());
			
			
		}
	}

}
