package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Arthur Nunes",345673);
		Aluno a2 = new Aluno("Mauricio Pereira",432455);
		Aluno a3 = new Aluno("Jeremias Nogueira",567873);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
//		versão antiga Java 5
//		Set<Aluno> alunos = javaColecoes.getAlunos();
//		Iterator<Aluno> iterador = alunos.iterator();
//		while(iterador.hasNext()) {
//			Aluno proximo = iterador.next();
//			System.out.println(proximo);
//		}
		
//		versão atual Java 8
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("O aluno "+ a1.getNome() +" está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno a4 = new Aluno("Mauricio Pereira",432455);
		System.out.println("Turini está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a4));
		
		System.out.println(a2.equals(a4));
		
		System.out.println(a2.hashCode() == a4.hashCode());
		
		
	}

}
