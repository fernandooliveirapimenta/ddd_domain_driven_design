package br.com.alura.gameficacao.infra.selo;

import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.gameficacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.gameficacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {
    @Override
    public void adicionar(Selo selo) {
        System.out.println("Add");
    }

    @Override
    public List<Selo> selosDo(CPF cpf) {
        return new ArrayList<>();
    }
}
