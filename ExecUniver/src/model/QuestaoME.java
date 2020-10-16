package model;

public class QuestaoME extends QuestaoSimples {
	private String a1;
	private String a2;
	private String a3;
	private String a4;
	
	public QuestaoME (String enunciado, String resposta, String a1, String a2, String a3, String a4) {
		super(enunciado, resposta);
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;		
	}


	public String aplicarQuestao() {
		return "Quest�o:       "+super.enunciado+"\n"+
	           "a) "+this.a1+"\n"+
	           "b) "+this.a2+"\n"+
	           "c) "+this.a3+"\n"+
	           "d) "+this.a4;
	}

}
