package br.com.alura.shared.dominio.evento;

import java.util.ArrayList;
import java.util.List;

public class PublicadorDeEventos {

    private final List<Ouvinte> ouvintes = new ArrayList<>();

    public void adicionarOuvinte(Ouvinte ouvinte) {
        this.ouvintes.add(ouvinte);
    }


    public void publicar(Evento evento) {
        this.ouvintes.forEach(o -> o.processa(evento));
    }
}
