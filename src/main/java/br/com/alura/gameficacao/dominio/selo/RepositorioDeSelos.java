package br.com.alura.gameficacao.dominio.selo;

import br.com.alura.escola.dominio.aluno.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void adicionar(Selo selo);
    List<Selo> selosDo(CPF cpf);
}
