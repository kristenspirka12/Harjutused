package Car;

public class Isikukood {
	private String isikukood;
	private Riigikood riigikood;
	
	public Isikukood(String isikukood, Riigikood riigikood) {
		this.isikukood = isikukood;
		this.riigikood = riigikood;
	}

	@Override
	public String toString() {
		return "Isikukood [isikukood=" + isikukood + ", riigikood=" + riigikood + "]";
	}
	
	
	
}
