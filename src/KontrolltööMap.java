import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kontrollt��Map {

	public static void main(String[] args) {
		Kontrollt��Map kt = new Kontrollt��Map();

		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "a");
		map1.put(2, "ba");
		map1.put(3, "aabits");

		System.out.println(kt.keysStartsA(map1));
		
		
		List<String> isikukoodid = new ArrayList<>();
		isikukoodid.add("39001247777");
		isikukoodid.add("48501241234");
		
		// => [ {"39001247777" : "mees"}, {"48501241234" : "naine"}]
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
		
		
		return null;
	}
	
	private String getSex(String code) {
		Integer firstNumber = Integer.parseInt(code.substring(0,1));
		boolean isEven = firstNumber % 2 == 0;
		return isEven ? "naine" : "mees";
	}
}
