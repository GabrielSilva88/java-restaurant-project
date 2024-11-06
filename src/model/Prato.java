/*
Crie uma classe abstrata Prato que representa os pratos do cardápio do restaurante. 
Esta classe deve conter pelo menos os seguintes atributos e métodos:

- Atributo nome.
- Atributo preco.
- Método construtor.
- Método preparar (obrigatório pela implementação).
*/
package model;

public abstract class Prato {
	
	// ATRIBUTOS
	private String nome;
	private double preco;
	
	// GET(); AND SET();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// MÉTODO CONSTRUTOR.
	public Prato(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	// MÉTODO PREPARAR	
	public abstract void preparar();
}
