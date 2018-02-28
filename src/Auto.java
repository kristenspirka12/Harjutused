package Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Auto {
	private Automark automark;
	private String mudel;
	private String numbrim�rk;
	private LocalDate arvelev�tt;
	private List<String> omanikud;
	
	
	public Auto(Automark automark, String mudel, String numbrim�rk, LocalDate arvelev�tt, List<String> omanikud) {
		this.automark = automark;
		this.mudel = mudel;
		this.numbrim�rk = numbrim�rk;
		this.arvelev�tt = arvelev�tt;
		this.omanikud = omanikud;
	}

	/**
	 * @return the automark
	 */
	public Automark getAutomark() {
		return automark;
	}

	/**
	 * @param automark the automark to set
	 */
	public void setAutomark(Automark automark) {
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
	 * @return the arvelev�tt
	 */
	public LocalDate getArvelev�tt() {
		return arvelev�tt;
	}

	/**
	 * @param arvelev�tt the arvelev�tt to set
	 */
	public void setArvelev�tt(LocalDate arvelev�tt) {
		this.arvelev�tt = arvelev�tt;
	}

	/**
	 * @return the omanikud
	 */
	public List<String> getOmanikud() {
		return omanikud;
	}

	/**
	 * @param omanikud the omanikud to set
	 */
	public void setOmanikud(List<String> omanikud) {
		this.omanikud = omanikud;
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

	
	@Override
	public String toString() {
		return "Auto [automark=" + automark + ", mudel=" + mudel
				+ ", numbrim�rk=" + numbrim�rk + ", arvelev�tt=" + arvelev�tt
				+ ", omanikud=" + omanikud + "]";
	}
	

}

