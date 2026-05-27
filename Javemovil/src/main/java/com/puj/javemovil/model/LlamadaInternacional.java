package com.puj.javemovil.model;

import java.time.LocalDate;

public class LlamadaInternacional extends Llamada {
    private String paisDestino;
    public LlamadaInternacional(long duracion, LocalDate fecha, String paisDestino, long telefonoDestinatario, long valor) {
        super(duracion, fecha, telefonoDestinatario, valor);
        this.paisDestino = paisDestino;
    }
    public String getPaisDestino() {
        return paisDestino;
    }
    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }
    @Override
    public long CalularValorLlamada() {
        return getDuracion() * //200;
    }

}
