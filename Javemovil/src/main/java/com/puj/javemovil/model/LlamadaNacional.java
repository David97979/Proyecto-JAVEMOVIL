package com.puj.javemovil.model;
import java.time.LocalDate;

public class LlamadaNacional extends Llamada {
    public LlamadaNacional(long duracion, LocalDate fecha, long telefonoDestinatario, long valor) {
        super(duracion, fecha, telefonoDestinatario, valor);
    }

    @Override
    public long CalularValorLlamada() {
        return getDuracion() * //100;
    }
}
