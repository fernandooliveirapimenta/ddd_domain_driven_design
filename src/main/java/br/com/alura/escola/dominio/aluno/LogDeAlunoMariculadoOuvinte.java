package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.Evento;
import br.com.alura.escola.dominio.Ouvinte;

public class LogDeAlunoMariculadoOuvinte extends Ouvinte {

    @Override
    public void reageAo(Evento evento) {
       AlunoMariculadoEvento  ev = (AlunoMariculadoEvento) evento;
        System.out.printf("Aluno com CPF %s maticulado em: %s",
                ev.getCpfDoAluno().getNumero(), ev.momento().toString());

    }


    @Override
    protected boolean deveProcesssar(Evento evento) {
        return evento instanceof AlunoMariculadoEvento;
    }
}
