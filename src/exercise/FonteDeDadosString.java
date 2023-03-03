package exercise;

public class FonteDeDadosString implements FonteDeDados {
	
	private String str;
	
	public FonteDeDadosString(String str){
		this.str = str;
	}

	@Override
	public String resultado() {
		return str;
	}
}