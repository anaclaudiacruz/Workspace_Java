package userinterface;

import model.QuestaoSimples;
import model.QuestaoComDica;
import model.QuestaoME;

import java.util.Scanner;

public class AplicacaoPrincipal {
	public static void main(String args[]) {

		QuestaoSimples questoes[];

		questoes    = new QuestaoSimples[5];
		questoes[0] = new QuestaoSimples ("Enunciado 1","Resposta 1");		
		questoes[1] = new QuestaoComDica ("Enunciado 2","Resposta 2","Dica 2");
		questoes[2] = new QuestaoME      ("Enunciado 3","c","Resposta 1","Resposta 2","Resposta 3","Resposta 4");
		questoes[3] = new QuestaoME      ("Enunciado 4","d","Resposta 1","Resposta 2","Resposta 3","Resposta 4");
		questoes[4] = new QuestaoComDica ("Enunciado 5","Resposta 5","Dica 5");		

		Scanner teclado = new Scanner(System.in);
		String resposta;
		int    pontos=0 ; 
		
//		for (QuestaoSimples q: questoes) {
		for (int pos=0; pos<questoes.length; pos++) {
			System.out.println(questoes[pos].aplicarQuestao());
			System.out.println(" ");
			resposta = teclado.nextLine();
			if (questoes[pos].corrigir(resposta)) {
				pontos++;
			}
		}
		System.out.println("Voce acertou "+pontos+" de um total de "+questoes.length);

	}
}