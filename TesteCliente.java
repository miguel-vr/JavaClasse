package br.com.exercicios.classe;



public class TesteCliente {

	public static void main(String[] args) {
		cliente a1 = new cliente();
		cliente a2 = new cliente();
		
		a1.nome = "Carlos";
		a1.sobrenome = "Faria";
		a1.idade = 44;
		a1.cpf = "19880987730";
		
		
		System.out.println(a1.nome);
		System.out.println(a1.sobrenome);
		System.out.println(a1.idade);
		System.out.println(a1.cpf);
		
		
		
		a1.fazerCadastro();
		a1.comprando();
		a1.pagando();
		System.out.println();
		
		a2.nome = "Marilene";
		a2.sobrenome = "Borges";
		a2.idade = 25;
		a2.cpf = "12339894420";
		
		
		System.out.println(a2.nome);
		System.out.println(a2.sobrenome);
		System.out.println(a2.idade);
		System.out.println(a2.cpf);
		
		
		a2.fazerCadastro();
		a2.comprando();
		a2.pagando();

	}

}
