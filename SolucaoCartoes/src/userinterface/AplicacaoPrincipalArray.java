package userinterface;

import java.util.ArrayList;
import core.CartaoCashBack;
import core.CartaoPrePago;

public class AplicacaoPrincipalArray {

	public static void main(String args[]) {

		/*
		CartaoPrePago cartoes[];  // defino um vetor de cart�es (Array)
		cartoes = new CartaoPrePago[4]; // defino o tamanho do meu array
		cartoes[0] = new CartaoPrePago ("Isidro ","1111 2222 3333 4444", 2030, 10, 1000.0);
		cartoes[1] = new CartaoCashBack("Nicolas","2222 3333 4444 5555", 2030,  8, 1000.0, 0);
		cartoes[2] = new CartaoCashBack("Luana  ","3333 4444 5555 6666", 2030,  8, 1000.0, 1);
		cartoes[3] = new CartaoCashBack("Pipoca ","4444 5555 6666 7777", 2030,  8, 1000.0, 2);
		*/
		
		ArrayList<CartaoPrePago> cartoes;
		cartoes = new ArrayList<CartaoPrePago>();
		
		cartoes.add(new CartaoPrePago ("Isidro ","1111 2222 3333 4444", 2030, 10, 1000.0));
		cartoes.add(new CartaoCashBack("Nicolas","2222 3333 4444 5555", 2030,  8, 1000.0, 0));
		cartoes.add(new CartaoCashBack("Luana  ","3333 4444 5555 6666", 2030,  8, 1000.0, 1));
		cartoes.add(new CartaoCashBack("Pipoca ","4444 5555 6666 7777", 2030,  8, 1000.0, 2));		
		
		/*for (int pos=0; pos<cartoes.length; pos++) {
			System.out.println(cartoes[pos]);
		}
		*/
		
		for (int pos=0; pos<cartoes.size(); pos++) {
		/*	CartaoPrePago c = cartoes.get(pos);
			System.out.println(c); */
			
			System.out.println(cartoes.get(pos));
		}
		
		System.out.println("\n--> comprando R$ 100,00 em cada um\n");
		
		for (CartaoPrePago c: cartoes) {
			c.comprar(100.0);
			System.out.println(c);
		}
	}

}