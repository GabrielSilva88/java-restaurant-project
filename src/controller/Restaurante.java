/*  Classe Restaurante

→ Crie uma classe chamada Restaurante que gerenciará o cardápio e a preparação dos pratos. 
  Esta classe deve possuir uma ArrayList para armazenar os pratos adicionados ao cardápio e implementar os seguintes métodos:

- void adicionarPrato(Prato prato): Adiciona um prato ao cardápio.
- void removerPrato(Prato prato): Remove um prato do cardápio.
- void listarPratos(): Lista os pratos do cardápio.
- void prepararPratos(): Prepara todos os pratos do cardápio.
*/
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Prato;

public class Restaurante {

	Scanner scan = new Scanner(System.in);

	/* ARMAZENA PRATOS AO CARDAPIO LISTA */
	List<Prato> cardapio = new ArrayList<>();
	
	// MÉTODOS
	// Adiciona um prato ao cardápio.
	public void adicionarPrato(Prato prato) {
		cardapio.add(prato);
		
	}

	// Remove um prato do cardápio.
	public void removerPrato(Prato prato) {
		if (!cardapio.isEmpty()) {
			System.out.println("Prato retirado: " + cardapio);
		} else {
			System.out.println("Cardapio está Vazia");
		}
	}

	// Lista os pratos do cardápio.
	public void listarPratos() {

	}

	// Lista os pratos do cardápio.
	public void prepararPratos() {

	}
}
