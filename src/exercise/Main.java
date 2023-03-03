package exercise;

public class Main {
	
	public static void main(String[] args) {
		String str = "Padroes de projeto";

		//Voce deve implementar o Decorator para manipulacao de Strings.
		
		//A interface FonteDeDados ja esta implementada.
		//A classe FonteDeDadosDecorator ja esta implementada.
		
		//O que precisa ser implementado:
		// InverteDecorator: inverte a String.
		// CaixaAltaDecorator: coloca String em caixa alta.
		// FonteDeDadosString uma classe que implementa "FonteDeDados".
		// e armazena simplesmente uma String.
		
		FonteDeDados font1 = new InverteDecorator(new CaixaAltaDecorator(new FonteDeDadosString(str)));
		FonteDeDados font2 = new CaixaAltaDecorator(new InverteDecorator(new FonteDeDadosString(str)));
		FonteDeDados font3 = new CaixaAltaDecorator(new FonteDeDadosString(str));
		FonteDeDados font4 = new InverteDecorator(new FonteDeDadosString(str));
		FonteDeDados font5 = new FonteDeDadosString(str);
		
		System.out.println(font1.resultado());
		System.out.println(font2.resultado());
		System.out.println(font3.resultado());
		System.out.println(font4.resultado());
		System.out.println(font5.resultado());
		// Saida deve ser: OTEJORP ED SEORDAP
	}
}