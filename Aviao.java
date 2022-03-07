package br.com.exercicios.classe;

public class Aviao {
	
		String companhia;
		String modelo;
		String tamanho;
		int fabricacao;
		
	
		void AutorizarVoo(){
			System.out.println("Autorizando o voo...");
		}
		
		void PrepararEquipamentos() {
			System.out.println("Preparando equipamentos...");
		}
		
		void Docolar() {
			System.out.println("Decolando....");
		}
}
