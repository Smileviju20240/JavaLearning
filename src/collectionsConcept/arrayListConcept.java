package collectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrayListConcept {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Vijay Dhage");
		ar.add("Sachin Dhage");
		ar.add("Govind Dhage");
		ar.add("Vijaya Dhage");
		ar.add("Sheetal Dhage");

		System.out.println(ar.size());

		for (String s : ar) {
			System.out.println(s);
		}

		ar.add(2, "Prerna Dhage");
		ar.add(1, "Priyanka Dhage");

		System.out.println(ar.size());

		for (int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(34);
		ar1.add(26);
		ar1.add(36);
		ar1.add(38);
		ar1.add(62);
		ar1.add(55);
		ar1.add(40);
		
		ListIterator<Integer> it = ar1.listIterator();
		while(it.hasNext()) {
			Integer text = it.next();
			System.out.println(text);
		}
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("VijayDhage");
		ar2.add("Dhage");
		ar2.add("Dhage");
		ar2.add("Dhage");
		ar2.add("Dhage");
		System.out.println(ar2.size());
		ar.addAll(ar2);
		System.out.println(ar.size());
		
		ar.removeAll(ar2);
		System.out.println(ar.size());
		for(String name : ar) {
			System.out.println(name);
		}
		
		Employee e1 = new Employee(01, "Vijay", 1, true);
		Employee e2 = new Employee(02, "Jay", 2, false);
		Employee e3 = new Employee(03, "Vikas", 1, true);
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		Iterator<Employee> it2 = emp.iterator();
		while(it2.hasNext()) {
			Employee text = it2.next();
			System.out.println(text.emp_Id);
			System.out.println(text.emp_Name);
			System.out.println(text.dept_Id);
			System.out.println(text.e_Active);
		}
		
	}

}
