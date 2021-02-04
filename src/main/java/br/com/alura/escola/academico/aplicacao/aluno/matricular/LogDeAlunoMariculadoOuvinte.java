package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.academico.dominio.aluno.AlunoMariculadoEvento;
import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.Ouvinte;
import br.com.alura.escola.shared.dominio.evento.TipoDeEventoEnum;

public class LogDeAlunoMariculadoOuvinte extends Ouvinte {

    @Override
    public void reageAo(Evento evento) {
        System.out.println(this.getClass().getSimpleName() + " evento " + evento.tipo());

        AlunoMariculadoEvento ev = (AlunoMariculadoEvento) evento;
        System.out.printf("Aluno com CPF %s maticulado em: %s",
                ev.getCpfDoAluno().getNumero(), ev.momento().toString());
        System.out.println("");

    }


    @Override
    protected boolean deveProcesssar(Evento evento) {
        return TipoDeEventoEnum.ALUNO_MATRICULADO.equals(evento.tipo());
    }
}
