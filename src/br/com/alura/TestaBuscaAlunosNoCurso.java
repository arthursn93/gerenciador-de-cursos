package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));
		
		Aluno a1 = new Aluno("Arthur Nunes",345673);
		Aluno a2 = new Aluno("Mauricio Pereira",432455);
		Aluno a3 = new Aluno("Jeremias Nogueira",567873);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem � o aluno com matricula 432455?");
		Aluno aluno = javaColecoes.buscaMatriculado(432455);
		System.out.println("Aluno: " + aluno);
	}

}
