import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kontrolltöö {

	public static void main(String[] args) {
		
		String[] words = new String[]{"diivan", "gorilla", "delfiin", "orav", "dşungel", "hobune"};
		Kontrolltöö kt = new Kontrolltöö();
		int[] numsarray = { 7, 10, 6, 9, 20, 4, 5, 12 };
		List<String> wordList = new ArrayList<>(Arrays.asList("karu", "kuu", "tiiger", "lammas", "kaelkirjak"));
		
		System.out.println("CountA: " + kt.countD(words));
		System.out.println("EvenNumber: " + kt.evenNumber(numsarray));	
		System.out.println("GetShortestWord: " + kt.getShortestWord(words));	
//		System.out.println(" " + kt.evenNumber(numsarray));	
//		System.out.println(" " + kt.evenNumber(numsarray));	
		
	}

	//1. ülesanne
	// Etteantud massiivist loetleda kokku mitu sõna algab "d" tähega.
	public int countD(String[] words) {
		int count = 0;
		for (String string : words) {
			if (string.substring(0, 1).equals("d")) {
				count++;
			}
		}
		return count;
	}
	
	//2. ülesanne
	// Etteantud massiivist leida kõik paarisarvud. Tagastada list nendest.
	public ArrayList<Integer> evenNumber (int[] numsarray) {
		ArrayList<Integer> numberList = new ArrayList<>();
		for (int item : numsarray) {
			if (item % 2 == 0) {
				numberList.add(item);
			}
		}
		return numberList;
			
	}
	
	//3. ülesanne
	//Leida etteantud massiivi kõige lühem sõna.
	public String getShortestWord(String[] words) {
		String shortest = "";
		for (String str : words) {
			if (str.length() > shortest.length()) {
				shortest = str;
			}
		}
		return shortest;
		
	}
	
	//4. ülesanne
	//Tagasta tõeväärtus (boolean - true/false), kas ArrayListis on mõni etteantud sõna. 
	//public boolean
	
	
	//5. ülesanne
	//Leida, kas kahes etteantud listis on esimesed ja viimased elemendid samad.
	
	
	
}
