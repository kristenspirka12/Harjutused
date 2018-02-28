package Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Auto {
	private Automark automark;
	private String mudel;
	private String numbrimärk;
	private LocalDate arvelevõtt;
	private List<String> omanikud;
	
	
	public Auto(Automark automark, String mudel, String numbrimärk, LocalDate arvelevõtt, List<String> omanikud) {
		this.automark = automark;
		this.mudel = mudel;
		this.numbrimärk = numbrimärk;
		this.arvelevõtt = arvelevõtt;
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
	 * @return the numbrimärk
	 */
	public String getNumbrimärk() {
		return numbrimärk;
	}

	/**
	 * @return the arvelevõtt
	 */
	public LocalDate getArvelevõtt() {
		return arvelevõtt;
	}

	/**
	 * @param arvelevõtt the arvelevõtt to set
	 */
	public void setArvelevõtt(LocalDate arvelevõtt) {
		this.arvelevõtt = arvelevõtt;
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
	 * @param numbrimärk the numbrimärk to set
	 */
	public void setNumbrimärk(String numbrimärk) {
		this.numbrimärk = numbrimärk;
	}
	
	public void addOmanikud(String omanik) {
		this.omanikud.add(omanik);
	}

	
	@Override
	public String toString() {
		return "Auto [automark=" + automark + ", mudel=" + mudel
				+ ", numbrimärk=" + numbrimärk + ", arvelevõtt=" + arvelevõtt
				+ ", omanikud=" + omanikud + "]";
	}
	

}

