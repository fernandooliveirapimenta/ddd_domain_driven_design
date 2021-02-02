package br.com.alura.shared.dominio.evento;

public abstract class Ouvinte {

    public void processa(Evento evento){
        if(this.deveProcesssar(evento)) {
            this.reageAo(evento);
        }
    }

    protected abstract void reageAo(Evento evento);

    protected abstract boolean deveProcesssar(Evento evento);
}
