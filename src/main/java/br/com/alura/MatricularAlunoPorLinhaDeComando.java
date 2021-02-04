package br.com.alura;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.LogDeAlunoMariculadoOuvinte;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;

import br.com.alura.escola.gameficacao.aplicacao.selo.GeraSeloAlunoNovatoOuvinte;
import br.com.alura.escola.gameficacao.infra.selo.RepositorioDeSelosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";

		PublicadorDeEventos publicadorDeEventos = new PublicadorDeEventos();
		publicadorDeEventos.adicionarOuvinte(new LogDeAlunoMariculadoOuvinte());
		publicadorDeEventos.adicionarOuvinte(new GeraSeloAlunoNovatoOuvinte(new RepositorioDeSelosEmMemoria()));
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicadorDeEventos);
		matricular.executa(
				new MatricularAlunoDto(nome, 
						cpf, 
						email));
	}

}
