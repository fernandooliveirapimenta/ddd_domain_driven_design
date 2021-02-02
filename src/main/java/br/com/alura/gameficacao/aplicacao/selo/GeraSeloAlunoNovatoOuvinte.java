package br.com.alura.gameficacao.aplicacao.selo;

import br.com.alura.gameficacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.gameficacao.dominio.selo.Selo;
import br.com.alura.shared.dominio.CPF;
import br.com.alura.shared.dominio.evento.Evento;
import br.com.alura.shared.dominio.evento.Ouvinte;
import br.com.alura.shared.dominio.evento.TipoDeEventoEnum;

public class GeraSeloAlunoNovatoOuvinte extends Ouvinte {

    private final RepositorioDeSelos repositorioDeSelos;

    public GeraSeloAlunoNovatoOuvinte(RepositorioDeSelos repositorioDeSelos) {
        this.repositorioDeSelos = repositorioDeSelos;
    }

    @Override
    protected void reageAo(Evento evento) {
        System.out.println(this.getClass().getSimpleName() + " evento " + evento.tipo());
        Selo novato = new Selo((CPF) evento.informacoes().get("cpf"), "NOVATO");
        repositorioDeSelos.adicionar(novato);
    }

    @Override
    protected boolean deveProcesssar(Evento evento) {
        return TipoDeEventoEnum.ALUNO_MATRICULADO.equals(evento.tipo());
    }
}
