package aplicattion;

import javax.swing.JOptionPane;

import constantes.DiasSemana;

public class Exercicio2 {

	public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "Seja bem vindo querido professor, Artur!");
		
		String input  = JOptionPane.showInputDialog("Digite um número de 1 até 7 para verificar os dias da semana");
		
		int dia = Integer.parseInt(input);
		
		String nomeDia;
		switch(dia) {
		case DiasSemana.DOMINGO:
			nomeDia = "Domingo";
			break;
		
		case DiasSemana.SEGUNDA:
			nomeDia = "Segunda";
			break;
			
		case DiasSemana.TERCA:
			nomeDia = "Terça";
			break;
			
		case DiasSemana.QUARTA:
			nomeDia = "Quarta";
			break;
			
		case DiasSemana.QUINTA:
			nomeDia = "Quinta";
			break;
			
		case DiasSemana.SEXTA:
			nomeDia = "Sexta";
			break;
			
		case DiasSemana.SABADO:
			nomeDia = "Sabado";
			break;
			
		default:
			nomeDia = "Dia inválido";
			break;
			
		
		
		}
		JOptionPane.showMessageDialog(null, nomeDia);
		
	
	}
	
	

}
