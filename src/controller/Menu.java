/*	Crie uma classe Menu que interage com o sistema do restaurante.

- Implemente um menu interativo com opções para adicionar, remover, listar pratos e preparar os pratos do cardápio.
- Utilize a classe Scanner para receber entradas do usuário.
*/
package controller;

import java.util.List;
import java.util.Scanner;

import model.Prato;

public class Menu {

	private String nome;
	private double preco;

	List<Prato> cardapio;

	Scanner scan = new Scanner(System.in);

	public void iniciarMenu() {
		System.out.println("==== Menu ====\n" + "1. Adicionar Prato\n " + "2. Remover Prato\n " + "3. Listar Pratos \n "
				+ "4. Preparar Pratos\n " + "5. Sair\n " + "Escolha uma Opção:");
		int opcao = scan.nextInt();

		do {
			switch (opcao) {
			case 1:
				adicionarPrato();
				break;
			case 2:
				removerPrato();
				break;
			case 3:
				listarPratos();
				break;
			case 4:
				prepararPratos();
				break;
			case 5:
				System.out.println(" Saindo do Menu... ");
				break;

			default:
				System.out.println(" Escolha um opção: ");
				break;
			}
		} while (opcao != 5);

	}

	public void adicionarPrato() {
		System.out.println("Digite o nome do prato: ");
		String nome = scan.nextLine();

		System.out.println("Digite o preço do prato: ");
		double preco = scan.nextDouble();

		System.out.println(" Digite o tipo de prato\n 1 - Prato Principal 2 - Prato Sobremesa\n Digite um opção: ");
		int tipo = scan.nextInt();

		scan.nextLine();

		Prato prato = new Prato(nome, preco) {

			@Override
			public void preparar() {
				// TODO Auto-generated method stub
				System.out.println("Preparando o prato: " + nome);
			}
		};

		cardapio.add(prato);
		System.out.println("Prato adicionado.");
	}

	public void removerPrato() {
		if (cardapio.isEmpty()) {
			System.out.println("Cardápio vazio.");
			return;
		}

		System.out.println("Escolha o prato");
		listarPratos();
		System.out.println("Digital o número do prato:");
		int index = scan.nextInt();
		if (index > 0 && index <= cardapio.size()) {
			cardapio.remove(index - 1);
			System.out.println("Prato removido com sucesso!");
		} else {
			System.out.println("Número inválido.");
		}
	}

	public void listarPratos() {
		if (cardapio.isEmpty()) {
			System.out.println(" O cardápio esta vazio. ");
			return;
		}
		
		System.out.println("\n -* Cardápio *- ");
		int i = 1;
		
		for (Prato prato : cardapio) {
			System.out.println(i + ". " + prato.getNome() + " - R$" + prato.getPreco());
			i++;
		}
	}

	public void prepararPratos() {
		if (cardapio.isEmpty()) {
			System.out.println(" O cardápio está vazio. ");
			return;
		}
		System.out.println("\n Preparando pratos.");
		for (Prato prato : cardapio) {
			prato.preparar();
		}
	}
}
