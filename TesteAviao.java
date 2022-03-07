package br.com.exercicios.classe;



public class TesteAviao {

	public static void main(String[] args) {
		Aviao a1 = new Aviao();
		Aviao a2 = new Aviao();
		
		a1.companhia = "Tam";
		a1.modelo = "2AB44";
		a1.tamanho = "28m";
		a1. fabricacao = 2002;
		
		
		System.out.println(a1.companhia);
		System.out.println(a1.modelo);
		System.out.println(a1.tamanho);
		System.out.println(a1. fabricacao);
		
		
		
		a1.AutorizarVoo();
		a1.PrepararEquipamentos();
		a1.Docolar();
		System.out.println();
		
		a2.companhia = "latam";
		a2.modelo = "4VB88";
		a2.tamanho = "25m";
		a2. fabricacao = 2001;
		
		
		System.out.println(a2.companhia);
		System.out.println(a2.modelo);
		System.out.println(a2.tamanho);
		System.out.println(a2. fabricacao);
		
		
		a2.AutorizarVoo();
		a2.PrepararEquipamentos();
		a2.Docolar();
	}

	}


