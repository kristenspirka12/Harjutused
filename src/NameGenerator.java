package nameGeneration;

import java.util.Random;

public class NameGenerator {

	private String[] firstNames = {"Kati", "Mati", "Jaanus", "Peeter", "Mari" };
	private String[] lastNames = {"Tamm", "Kask", "Pilv", "Saar", "Oja", "Luts" };
	private String[] randomNames = {"a", "e", "o", "x", "b", "l", "f", "m", "z", "h", "t"};
	Random random = new Random();
	
	/*TODO Kui �lesanded on valmis, siis teha need �mbes selliselt, 
	et oleks v�imalik valida mehe ja naiste nimedele vahel. */
	
	public String getRandomFirstName() {
		return firstNames[random.nextInt(firstNames.length)];
	}
	
	public String getRandomLastName() {
		return lastNames[random.nextInt(lastNames.length)];
	}
	
	public String getRandomFullName() {
		return getRandomFirstName() + " " + getRandomLastName();
	}
	
	// Juhuslikest t�htedest 
	public String generateRandomName(int charNumber) {
		return "";
	}
	
	public Integer generateRandomNumberBetween(int beg, int end) {
		return null;
		//TODO
		
	}
	
	public boolean flipPenny() {
		//TODO
		return true;
	}
}
