import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Kontrollt��Map {

	public static void main(String[] args) {
		Kontrollt��Map kt = new Kontrollt��Map();

		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "a");
		map1.put(2, "ba");
		map1.put(3, "aabits");

		System.out.println(kt.keysStartsA(map1));
		// System.out.println(kt.keysStartsA(map1));

		List<String> isikukoodid = new ArrayList<>();
		isikukoodid.add("39001247777");
		isikukoodid.add("48501241234");

		// => [ {"39001247777" : "mees"}, {"48501241234" : "naine"}]
		System.out.println(kt.mapCodes(isikukoodid));
	}

	// �lesanne 1 ( => [1, 3]
	public List<Integer> keysStartsA(Map<Integer, String> map) {
		List<Integer> keys = new ArrayList<>();
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if (entry.getValue().startsWith("a")) {
				keys.add(entry.getKey());
			}
		}
		return keys;
	}

	// �lesanne 2
	public Map<String, String> mapCodes(List<String> codes) {
		// luua map, kuhu l�hevad isikukoodid koos "mees"/"naine"
		Map<String, String> map = new HashMap<String, String>();
		// FOR-loop codes
		for (String code : codes) {
			map.put(code, getSex(code) );
		}
		return map;
	}

	private String getSex(String code) {
		Integer firstNumber = Integer.parseInt(code.substring(0, 1));
		boolean isEven = firstNumber % 2 == 0;
		return isEven ? "naine" : "mees";
	}

	// �lesanne 3
	// Eemalda k�ik paarid, mille v��rtus on suurem kui 10.
	// public Map<Integer, String> biggerThan10 = new HashMap<Integer, String>();

	// �lesanne 4
	// Muuta etteantud mapi nii, et kui m�lemad v�tmed "a" ja "b" on esindatud, siis eemaldatakse v�ti-v��rtuspaar "c",
	// kui see on olemas. Kui "c" olemas ei ole, siis luua paar "d" :"a ja b puuduvad".

	// �lesanne 5
	// Antud massiiv ja t�ht. Meetodi �lesandeks on luua map, kus massiivi elemendid
	// on mapi v�tmed ja v��rtuseks on etteantud t�he esinemise arv antud s�nas.
	// V�ib teha eraldi abimeetodi s�nas vastava t�he esinemise kordade kohta.

}
