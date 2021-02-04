package br.com.alura.escola.gameficacao.infra.selo;

import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.gameficacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.gameficacao.dominio.selo.Selo;

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
