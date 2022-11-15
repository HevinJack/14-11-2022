package lists;

import java.util.ArrayList;
import java.util.Iterator;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		list.add("ravi");
		list.add("mohan");
		list.add("kumar");
		list.add("raj");
		
		Iterator itr=list.iterator();
		
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		

	}

}
