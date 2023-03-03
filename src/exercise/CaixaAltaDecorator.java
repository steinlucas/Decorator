package exercise;

public class CaixaAltaDecorator implements FonteDeDados {

	private FonteDeDados fonte;
	
	public CaixaAltaDecorator(FonteDeDados fonte) {
		this.fonte = fonte;
	}
	
	@Override
	public String resultado() {
		return fonte.resultado().toUpperCase();
	}
}