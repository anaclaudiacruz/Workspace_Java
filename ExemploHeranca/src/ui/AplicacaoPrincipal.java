package ui;

import model.Estudante;
import model.Pessoa;

public class AplicacaoPrincipal {
	public static void main(String [] args) {

    Pessoa p = new Pessoa();
    Estudante e = new Estudante();
    
    p.setNome("isidro");
    p.setEmail("isidro@isidro.com");
    p.setTelefone("999999999");
    
    p.imprimirInfo();
    
    e.setNome("pedro");
    e.setEmail("pedro@pedro.com");
    e.setTelefone("888888888");
    e.setCurso("Computação");
    e.setAnoConclusao(2020);
    
    e.imprimirInfo();

    
    
    
	}
}