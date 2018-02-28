package student;

public class IdentityCode {
	private String code;
	private Country country;
	
	public IdentityCode(String code, Country country) {
		super();
		this.code = code;
		this.country = country;
	}

	@Override
	public String toString() {
		return "IdentityCode [code=" + code + ", country=" + country + "]";
	}
	
	
	
}
