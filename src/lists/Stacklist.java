package lists;

import java.util.Iterator;
import java.util.Stack;

public class Stacklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>st=new Stack<String>();
		
		st.push("gopal");
		st.push("kevin");
		st.push("jack");
		st.push("sundar");
		st.push("selvam");
		
		st.pop();
		
		Iterator itr=st.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
