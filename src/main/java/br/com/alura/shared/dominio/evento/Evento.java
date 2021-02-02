package br.com.alura.shared.dominio.evento;

import java.time.LocalDateTime;
import java.util.Map;

public interface Evento {

    LocalDateTime momento();
    TipoDeEventoEnum tipo();
    Map<String, Object> informacoes();
}