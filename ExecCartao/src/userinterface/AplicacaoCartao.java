package userinterface;

import model.CartaoPrePago;
import model.CartaoCashBack;
import model.IsiException;

public class AplicacaoCartao {
	public static void main(String [] args) {
	
	CartaoPrePago c   = new CartaoPrePago("1234.5678.9012.3456","Isidro",2023,01,200); 
	CartaoPrePago cb1 = new CartaoCashBack("5678.9012.3456.7890","Pedro",2023,01,200,1);
	CartaoPrePago cb2 = new CartaoCashBack("5678.9012.3456.7890","Joao",2023,01,200,2);
	CartaoPrePago cb3 = new CartaoCashBack("5678.9012.3456.7890","Andre",2023,01,200,3);
	
/*	c.adicionarCredito(200);
	cb1.adicionarCredito(200);	
	cb2.adicionarCredito(200);
	cb3.adicionarCredito(200); */

	// try abaixo � para tratar exce��o de valor negativo
    try {
	   c.adicionarCredito(-200);
    }
    catch (IsiException ex) {
		System.out.println("Erro na regra de neg�cio");
		System.out.println("    --> "+ex.getMessage());
    }

    
	System.out.println("\n\n ---> Manipulando o cartao normal...");
	System.out.println(c);
    if (c.comprar(100)) {
	   System.out.println("Compra efetuada com sucesso");
   	}
	else {
	   System.out.println("Saldo insuficiente");
	}
	System.out.println(c.getNumeroCartao()+"/"+c.getNomeTitular()+"/"+c.getAnoValidade()+"/"+c.getMesValidade()+"  R$ "+c.getSaldo());

    
    System.out.println("\n\n ---> Manipulando o cartao cash back 1 2%...");
	System.out.println(cb1);
	if (cb1.comprar(100)) {
		System.out.println("Compra efetuada com sucesso");
	}
	else {
		System.out.println("Saldo insuficiente");
	}
	System.out.println(cb1.getNumeroCartao()+"/"+cb1.getNomeTitular()+"/"+cb1.getAnoValidade()+"/"+cb1.getMesValidade()+"  R$ "+cb1.getSaldo());

	
	
	
	System.out.println("\n\n ---> Manipulando o cartao cash back 2 5%...");
	System.out.println(cb2);
	if (cb2.comprar(100)) {
		System.out.println("Compra efetuada com sucesso");
	}
	else {
		System.out.println("Saldo insuficiente");
	}
	System.out.println(cb2.getNumeroCartao()+"/"+cb2.getNomeTitular()+"/"+cb2.getAnoValidade()+"/"+cb2.getMesValidade()+"  R$ "+cb2.getSaldo());

	
	
	System.out.println("\n\n ---> Manipulando o cartao cash back 3 8%...");
	System.out.println(cb3);
	if (cb3.comprar(100)) {
		System.out.println("Compra efetuada com sucesso");
	}
	else {
		System.out.println("Saldo insuficiente");
	}
	System.out.println(cb3.getNumeroCartao()+"/"+cb3.getNomeTitular()+"/"+cb3.getAnoValidade()+"/"+cb3.getMesValidade()+"  R$ "+cb3.getSaldo());



	}
	

}
