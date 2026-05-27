package com.puj.javemovil.model;

import java.util.ArrayList;

public abstract class Cuenta {
    private long id;
    private long numero;
    private ArrayList<Llamada> llamadas;
    public Cuenta(long id, long numero) {
        this.id = id;
        this.numero = numero;
        this.llamadas = new ArrayList<>();
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }
    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }
    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }
    public long obtenerPagoCuenta() {
        return numero;
    }


}
