import java.util.ArrayList;
import java.util.Arrays;

public class Kontrolltöö {

	public static void main(String[] args) {
		
		String[] words = new String[]{"diivan", "gorilla", "delfiin", "orav", "dşungel", "hobune"};
		Kontrolltöö kt = new Kontrolltöö();
		int[] numsarray = { 7, 10, 6, 9, 20, 4, 5, 12 };
		
		System.out.println("CountA: " + kt.countD(words));
		System.out.println("" + kt.countD(words));
		
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
	/*
	public ArrayList<Integer> evenNumber (int[] array) {
		for (int item : array) {
			if (item % 2 == 0) {
				
			}
		}
		return ;	
	}
	*/
}
