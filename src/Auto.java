package Car;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Auto {
	private String automark;
	private String mudel;
	private String numbrim�rk;
	private Date arvelev�tt;
	private List<String> omanikud;
	
	
	public Auto(String automark, String mudel, String numbrim�rk, Date arvelev�tt, List<String> omanikud) {
		this.automark = automark;
		this.mudel = mudel;
		this.numbrim�rk = numbrim�rk;
		this.arvelev�tt = arvelev�tt;
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
	 * @return the numbrim�rk
	 */
	public String getNumbrim�rk() {
		return numbrim�rk;
	}

	/**
	 * @param numbrim�rk the numbrim�rk to set
	 */
	public void setNumbrim�rk(String numbrim�rk) {
		this.numbrim�rk = numbrim�rk;
	}
	
	public void addOmanikud(String omanik) {
		this.omanikud.add(omanik);
	}
	

}

