package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student2 {
	int rollno;
	String name;
	int age;

	Student2(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class RollNumberComparator implements Comparator<Student2> {

	@Override
	public int compare(Student2 s1, Student2 s2) {

		//Student2 s1 = (Student2) o1;
		//Student2 s2 = (Student2) o2;

		if (s1.rollno == s2.rollno)
			return 0;
		else if (s1.rollno > s2.rollno)
			return 1;
		else
			return -1;

	}

}

class AgeComparator implements Comparator<Student2> {
	@Override
	public int compare(Student2 s1, Student2 s2) {
		/*Student2 s1 = (Student2) o1;
		Student2 s2 = (Student2) o2;*/

		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}

	}

class NameComparator implements Comparator<Student2> {
	public int compare(Student2 s1, Student2 s2) {
		/*Student2 s1 = (Student2) o1;
		Student2 s2 = (Student2) o2;*/

		return s1.name.compareTo(s2.name);
	}
}

public class ExUserDefindCompare_Comparator {
	public static void main(String args[]) {
		ArrayList<Student2> al = new ArrayList<Student2>();
		Student2 s=new Student2(101, "Vijay", 30);
		al.add(s);
		al.add(new Student2(106, "Ajay", 27));
		al.add(new Student2(105, "Jai", 21));
		System.out.println("Sorting by Name...");
		
		Collections.sort(al, new NameComparator());
		Iterator<Student2> itr = al.iterator();
		while (itr.hasNext()) {
			Student2 st = itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("sorting by age...");

		Collections.sort(al, new AgeComparator());
		
		Iterator<Student2> itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student2 st = itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age); 
		}
		
		System.out.println("Sorting the student objects using roll number !!!");
		
		
		Collections.sort(al, new RollNumberComparator());
		Iterator<Student2> itr3 = al.iterator();
		while (itr3.hasNext()) {
			Student2 st = (Student2) itr3.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
