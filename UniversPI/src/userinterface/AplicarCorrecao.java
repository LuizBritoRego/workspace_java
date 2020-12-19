package userinterface;

import java.util.Scanner;

import model.QuestaoSimples;
import model.QuestaoComDica;
import model.QuestaoMultipla;

public class AplicarCorrecao {
	public static void main(String[] args) {
		
		int pontos=0;
		Scanner teclado = new Scanner(System.in);
		QuestaoSimples avaliacao[];
		String respostaQuestao;
						
		avaliacao = new QuestaoSimples[6];
		avaliacao[0] = new QuestaoSimples("Qual o melhor time do Brasil?", "Sao Paulo");
		avaliacao[1] = new QuestaoMultipla("Quantos Mundiais tem o Palmeiras?","Zero", "Um","Dois" ,"Quatro","Zero");		
		avaliacao[2] = new QuestaoComDica("Quanto ao uniforme, Sao Paulo eh:", "Tricolor", "Tres cores");
		avaliacao[3] = new QuestaoSimples("Quem descobriu o Brasil?", "Pedro Alvares Cabral");
		avaliacao[4] = new QuestaoComDica("Quantos Mundiais tem o Sao Paulo?","Tres","Mais do que dois");
		avaliacao[5] = new QuestaoSimples("Quem eh o melhor professor de Java?", "Isidro");
		
		for (int pos=0; pos<avaliacao.length; pos++) {
			System.out.println(avaliacao[pos].aplicarQuestao());
			System.out.print("Sua resposta: ");
			respostaQuestao = teclado.nextLine();
			if (avaliacao[pos].corrigirQuestao(respostaQuestao)) {
				System.out.println("Resposta correta!!!");
				pontos++;
			}
			else {
				System.out.println("Voce deve estudar mais!!!");
			}
			System.out.println("-------------------------------------");
		}
		
		System.out.println("Voce acertou um total de "+pontos+"/"+avaliacao.length);
				 
		teclado.close();
	}
}
