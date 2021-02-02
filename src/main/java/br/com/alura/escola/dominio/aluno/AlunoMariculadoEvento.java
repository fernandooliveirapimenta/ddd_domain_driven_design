package br.com.alura.escola.dominio.aluno;

import br.com.alura.shared.dominio.evento.Evento;
import br.com.alura.shared.dominio.CPF;
import br.com.alura.shared.dominio.evento.TipoDeEventoEnum;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

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

    @Override
    public TipoDeEventoEnum tipo() {
        return TipoDeEventoEnum.ALUNO_MATRICULADO;
    }

    @Override
    public Map<String, Object> informacoes() {
        Map<String, Object> infos = new HashMap<>();
        infos.put("cpf", cpfDoAluno);
        return infos;
    }

    public CPF getCpfDoAluno() {
        return cpfDoAluno;
    }
}
