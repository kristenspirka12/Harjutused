package student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		
		Student mati = new Student("Mati", LocalDate.parse("2017-01-05"), Type.TUDENG);
		mati.addSubject(Subject.BIOLOOGIA);
		mati.addSubject(Subject.F‹‹SIKA);
		//System.out.println(mati);
		
		students.add(mati);
		students.add(new Student("Kati", LocalDate.parse("1986-03-08"), Type.L’PETAJA));
		
		Student vello = new Student("Vello", LocalDate.parse("1980-01-05"), Type.L’PETAJA, "38001055555", Country.RUSSIA);
		students.add(vello);
		
		for (Student student : students) {
			System.out.println(student);
		}

	}
}
