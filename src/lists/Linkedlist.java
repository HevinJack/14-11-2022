package lists;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>name=new LinkedList<String>();
		
		name.add("gopal");
		name.add("kevin");
		name.add("chandru");
		name.add("selvam");
		
		Iterator itr=name.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
