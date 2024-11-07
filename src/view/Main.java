/***Classe Principal (Main)**:

→ Crie uma classe principal (com o método main) para testar o sistema do restaurante.

→ Crie um objeto do tipo Restaurante, adicione diferentes pratos ao cardápio, liste os pratos disponíveis e prepare todos os pratos do cardápio.*/
package view;

import java.util.Scanner;

import controller.Menu;
import controller.Restaurante;

public class Main {
	
	public static void main(String[] args) {
		Restaurante r = new Restaurante();
		Menu m = new Menu();
		Scanner scan = new Scanner(System.in);
		
		m.iniciarMenu();
	}
}
