package model;

public class QuestaoSimples {
	protected String enunciado;
	protected String resposta;  // gabarito
	
	public QuestaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	public String aplicarQuestao() {
		return "Q: " + enunciado;
	}
	public boolean corrigirQuestao(String respostaQuestao) {
		return resposta.equals(respostaQuestao);
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
}