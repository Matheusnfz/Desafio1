package aplicattion;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "Bem vindo querido professor, Artur!");
		
		String numero = JOptionPane.showInputDialog("Digite um número: ");
		
		int valor = Integer.parseInt(numero);
		
		if (valor > 0 ) {
			JOptionPane.showMessageDialog(null, "Número positivo");
		}
		
		else if (valor < 0 ) {
			JOptionPane.showMessageDialog(null,"Número negativo");
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "NEUTRO");
		
		}
		
	}

}
