package exercise;

public class InverteDecorator implements FonteDeDados {

	FonteDeDados fonte;
	
	public InverteDecorator(FonteDeDados fonte) {
		this.fonte = fonte;
	}
	
	@Override
	public String resultado() {
		return new StringBuilder(fonte.resultado()).reverse().toString();
	}
}