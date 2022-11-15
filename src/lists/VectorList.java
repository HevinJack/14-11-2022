package lists;

import java.util.Iterator;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> na=new Vector<String>();
		
		na.add("sundar");
		na.add("kevin");
		na.add("ramesh");
		na.add("suresh");
		
		Iterator itr=na.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
