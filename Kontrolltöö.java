import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kontrollt�� {

	public static void main(String[] args) {
		
		String[] words = new String[]{"diivan", "gorilla", "delfiin", "orav", "d�ungel", "hobune"};
		Kontrollt�� kt = new Kontrollt��();
		int[] numsarray = { 7, 10, 6, 9, 20, 4, 5, 12 };
		List<String> wordList = new ArrayList<>(Arrays.asList("karu", "kuu", "tiiger", "lammas", "kaelkirjak"));
		
		System.out.println("CountA: " + kt.countD(words));
		System.out.println("EvenNumber: " + kt.evenNumber(numsarray));	
		System.out.println("GetShortestWord: " + kt.getShortestWord(words));	
//		System.out.println(" " + kt.evenNumber(numsarray));	
//		System.out.println(" " + kt.evenNumber(numsarray));	
		
	}

	//1. �lesanne
	// Etteantud massiivist loetleda kokku mitu s�na algab "d" t�hega.
	public int countD(String[] words) {
		int count = 0;
		for (String string : words) {
			if (string.substring(0, 1).equals("d")) {
				count++;
			}
		}
		return count;
	}
	
	//2. �lesanne
	// Etteantud massiivist leida k�ik paarisarvud. Tagastada list nendest.
	public ArrayList<Integer> evenNumber (int[] numsarray) {
		ArrayList<Integer> numberList = new ArrayList<>();
		for (int item : numsarray) {
			if (item % 2 == 0) {
				numberList.add(item);
			}
		}
		return numberList;
			
	}
	
	//3. �lesanne
	//Leida etteantud massiivi k�ige l�hem s�na.
	public String getShortestWord(String[] words) {
		String shortest = "";
		for (String str : words) {
			if (str.length() > shortest.length()) {
				shortest = str;
			}
		}
		return shortest;
		
	}
	
	//4. �lesanne
	//Tagasta t�ev��rtus (boolean - true/false), kas ArrayListis on m�ni etteantud s�na. 
	//public boolean
	
	
	//5. �lesanne
	//Leida, kas kahes etteantud listis on esimesed ja viimased elemendid samad.
	
	
	
}
