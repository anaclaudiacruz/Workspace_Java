
public class PrincipalHorario {

	public static void main(String[] args) {

		Horario h1, h2, h3, h4;
		String HU1, HU2, HU3, HU4, HP1, HP2, HP3, HP4;

		h1 = new Horario();
		h2 = new Horario();
		h3 = new Horario();
		h4 = new Horario();

		h1.setTime(00, 00, 00);
		h2.setTime(01, 30, 07);
		h3.setTime(13, 30, 07);
		h4.setTime(24, 00, 00);

		HU1 = h1.exibirHoraUniversal();
		HU2 = h2.exibirHoraUniversal();
		HU3 = h3.exibirHoraUniversal();
		HU4 = h4.exibirHoraUniversal();
		HP1 = h1.exibirHoraPadrao();
		HP2 = h2.exibirHoraPadrao();
		HP3 = h3.exibirHoraPadrao();
		HP4 = h4.exibirHoraPadrao();

		
		System.out.println(" ");		
		System.out.println("Exibindo em Universal ");
		System.out.println("Hora 1 em Universal: " + HU1 + " e em Padr�o: "+ HP1);
		System.out.println("Hora 2 em Universal: " + HU2 + " e em Padr�o: "+ HP2);
		System.out.println("Hora 3 em Universal: " + HU3 + " e em Padr�o: "+ HP3);
		System.out.println("Hora 4 em Universal: " + HU4 + " e em Padr�o: "+ HP4);
		System.out.println(" ");

	}
}
