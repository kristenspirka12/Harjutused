package Car;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Auto {
	private String automark;
	private String mudel;
	private String numbrimärk;
	private Date arvelevõtt;
	private List<String> omanikud;
	
	
	public Auto(String automark, String mudel, String numbrimärk, Date arvelevõtt, List<String> omanikud) {
		this.automark = automark;
		this.mudel = mudel;
		this.numbrimärk = numbrimärk;
		this.arvelevõtt = arvelevõtt;
		this.omanikud = new ArrayList<>();
	}

	/**
	 * @return the automark
	 */
	public String getAutomark() {
		return automark;
	}

	/**
	 * @param automark the automark to set
	 */
	public void setAutomark(String automark) {
		this.automark = automark;
	}

	/**
	 * @return the mudel
	 */
	public String getMudel() {
		return mudel;
	}

	/**
	 * @param mudel the mudel to set
	 */
	public void setMudel(String mudel) {
		this.mudel = mudel;
	}

	/**
	 * @return the numbrimärk
	 */
	public String getNumbrimärk() {
		return numbrimärk;
	}

	/**
	 * @param numbrimärk the numbrimärk to set
	 */
	public void setNumbrimärk(String numbrimärk) {
		this.numbrimärk = numbrimärk;
	}
	
	public void addOmanikud(String omanik) {
		this.omanikud.add(omanik);
	}
	

}

