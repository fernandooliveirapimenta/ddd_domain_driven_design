package br.com.alura.gameficacao.dominio.selo;

import br.com.alura.escola.dominio.aluno.CPF;

public class Selo {

    private CPF cpf;
    private String selo;

    public Selo(CPF cpf, String selo) {
        this.cpf = cpf;
        this.selo = selo;
    }

    public CPF getCpf() {
        return cpf;
    }

    public String getSelo() {
        return selo;
    }
}
