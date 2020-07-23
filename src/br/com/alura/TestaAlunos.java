package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Arthur Nunes");
		alunos.add("Alberto Rodriguez");
		alunos.add("Nico Steppat");
		alunos.add("Renan Moreira");
		alunos.add("Marcos Pereira");
		
		System.out.println(alunos.size());
		
		boolean ExisteEsseAluno = alunos.contains("Marcos Mion");
		System.out.println(ExisteEsseAluno);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		System.out.println(alunos);
	}

}
