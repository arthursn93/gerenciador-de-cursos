package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		// Vari�veis
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e obetos", 15);
		// Lista
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		System.out.println(aulas);
		
		// Ordena uma lista do tipo Aula
		Collections.sort(aulas);
		System.out.println(aulas);
		
		// Ordena uma lista do tipo Aula ordenada pelo tempo
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		

	}

}
