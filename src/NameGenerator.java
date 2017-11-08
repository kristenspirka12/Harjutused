package nameGeneration;

import java.util.Random;

public class NameGenerator {

	private String[] firstNames = {"Kati", "Mati", "Jaanus", "Peeter", "Mari" };
	private String[] lastNames = {"Tamm", "Kask", "Pilv", "Saar", "Oja", "Luts" };
	private String[] chars = {"a", "e", "o", "x", "b", "l", "f", "m", "z", "h", "t", "w"};
	String[] peopleNames = { "Peeter", "Daniel", "Karl", "Hendrik", "Oliver", "Eva", "Diana", "Reet", "Jane" };
	Random random = new Random();
	
	/*TODO Kui ülesanded on valmis, siis teha need ümber selliselt, 
	et oleks võimalik valida mehe ja naiste nimede vahel. */
	
	public String getRandomFirstName() {
		return firstNames[random.nextInt(firstNames.length)];
	}
	
	public String getRandomLastName() {
		return lastNames[random.nextInt(lastNames.length)];
	}
	
	public String getRandomFullName() {
		return getRandomFirstName() + " " + getRandomLastName();
	}
	
	// Juhuslikest tähtedest sõna
	
	public String generateRandomName(int charNumber) {
		return "";
	}
	
	String getRandomChar(int charNumber) {
		
		return chars[random.nextInt(chars.length)];
	}
	
	public Integer generateRandomNumberBetween(int beg, int end) {
		return null;
		
	}
	
	public boolean flipPenny() {
		return true;
	}
	
	
	public String[] getRandomNames(int amount) {
		//uue massiivi(String[]) loomine, mis on sama pikk kui "amount" parameeter
		String peopleNames[] = new String[amount];
		
		//massiivi lisan nimed
		for (int i = 0; i < peopleNames.length; i++) { 
			// iga kord lisan nime massiivi.
		}
		return peopleNames;
		//tagastan massiiivi nimedega.
		//return ...
	}
}
