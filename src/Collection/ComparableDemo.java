package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int age;
	
	public Student(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + "]";
	}
	@Override
	public int compareTo(Student that) {
		if(this.age > that.age) {
			return 1;
		}else {
			return -1;
		}
	}
}
public class ComparableDemo {
	
	public static void main(String args[]) {
		List<Student> stud = new ArrayList<>();
		stud.add(new Student(21));
		stud.add(new Student(12));
		
		Collections.sort(stud);
		for(Student s : stud) {
			System.out.println(s);
		}
	}
}
