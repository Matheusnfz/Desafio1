package aplicattion;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Digite um número inteiro");
		
		int n = Integer.parseInt(input);
		
		//USANDO FOR LOOP 
		//EXTRUTURA DE REPETIÇÃO UTILIZADA PARA EXECUTAR DIVERSAS VEZES UM MESMO BLOCO E A SEQUÊNCIA DE COMANDOS É PROGRAMADA PARA VOLTAR AO SEU PONTO DE ORIGEM ASSIM QUE COMPLETADA.
		JOptionPane.showMessageDialog(null, "Usando for loop");
		for ( int i = 0; i < n; i ++) {
			JOptionPane.showMessageDialog(null, "for "+i+ ", while "+i+", do while"+i);
		}
		//USANDO WHILE LOOP
		//WHILE TAMBÉM É UMA ESTRUTURA DE REPETIÇÃO, ENQUANTO A MENSAGEM FOR VERDADEIRA ELA VAI RODAR
		JOptionPane.showMessageDialog(null, "Usando while loop");
		int a = 0;
		while ( a < n) {
			JOptionPane.showMessageDialog(null,"for "+a+ ", while "+a+", do while "+a);
			a++;
			
		}
		//USANDO DO WHILE LOOP
		//TAMBÉM É UMA ESTRUTURA DE REPETIÇÃO, PORÉM SÓ IRÁ SE REPETIR APENAS UMA ÚNIVA VEZ 
		JOptionPane.showMessageDialog(null, "Usando do while loop");
		int b = 0;
		do {
			JOptionPane.showMessageDialog(null, "for "+b+ ", while "+ b+ ", do while  "+b);
			b++;	
		}while (b < 0);
		
		
		
	}



}
