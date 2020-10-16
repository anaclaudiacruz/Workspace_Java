package ui;

import java.util.ArrayList;

import core.Funcionario;
import core.Chefe;
import core.Comissionado;
import core.Horista;
import core.Empreiteiro;

public class AplicacaoPrincipal {
	
 	public static void main(String args[]) {

 		ArrayList<Funcionario> funcs;
 		funcs = new ArrayList<Funcionario>();
 		
 		funcs.add(new Chefe        (1,"Pedro Chefe",10000f,10f,1000f));
 		funcs.add(new Comissionado (2,"Joao Comissionado",2000f,10f));
 		funcs.add(new Horista      (3,"Andre Horista",30f,10));
 		funcs.add(new Empreiteiro  (4,"Tom� Empreiteiro",5000f));

 		for (Funcionario f: funcs) { 
// 			f.calcularSalario(); 
 			System.out.printf("%-35s R$ %10.2f\n", f.getNome(), f.calcularSalario());
 		} 
 			

	} 

 		
}
