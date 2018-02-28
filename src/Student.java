package student;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Student {
	// private fields
	private String name;
	private LocalDate dateOfBirth;
	private List<Subject> subjects;
	private Type type;
	private IdentityCode idCode;

	// constructor
	public Student(String nime, LocalDate dateOfBirth, Type type) {
		this.name = nime;
		this.dateOfBirth = dateOfBirth;
		this.subjects = new ArrayList<Subject>();
		this.type = type;
	}

	public Student(String nime, LocalDate dateOfBirth, Type type, String idCode) {
		this.name = nime;
		this.dateOfBirth = dateOfBirth;
		this.subjects = new ArrayList<Subject>();
		this.type = type;
		this.idCode = new IdentityCode(idCode, Country.ESTONIA);
	}

	public Student(String nime, LocalDate dateOfBirth, Type type,
			String idCode, Country idCountry) {
		this.name = nime;
		this.dateOfBirth = dateOfBirth;
		this.subjects = new ArrayList<Subject>();
		this.type = type;
		this.idCode = new IdentityCode(idCode, Country.ESTONIA);
	}

	/**
	 * @return the name
	 */
	public String getNime() {
		return name;
	}

	/**
	 * @param nime
	 *            the name to set
	 */
	public void setNime(String nime) {
		this.name = nime;
	}

	/**
	 * @return the dateOfBirth
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the subjects
	 */
	public List<Subject> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects
	 *            the subjects to set
	 */
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public void addSubject(Subject subject) {
		this.subjects.add(subject);
	}

	public String getAgeAsString() {
		LocalDate today = LocalDate.now();
		Period p = Period.between(dateOfBirth, today);
		long p2 = ChronoUnit.DAYS.between(dateOfBirth, today);

		return this.name + " is " + p.getYears() + " years, " + p.getMonths() + 
				" months, and " + p.getDays() + " days old. (" + p2
				+ " days total)";
	}

	@Override
	public String toString() {
		return "Student [nime=" + name + ", dateOfBirth=" + dateOfBirth
				+ ", subjects=" + subjects + ", type=" + type + ", idCode="
				+ idCode + "]";
	}

}
