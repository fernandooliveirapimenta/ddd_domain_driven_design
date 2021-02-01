package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.Evento;

import java.time.LocalDateTime;

public class AlunoMariculadoEvento implements Evento {

    private final CPF cpfDoAluno;
    private final LocalDateTime momento;

    public AlunoMariculadoEvento(CPF cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return momento;
    }

    public CPF getCpfDoAluno() {
        return cpfDoAluno;
    }
}
