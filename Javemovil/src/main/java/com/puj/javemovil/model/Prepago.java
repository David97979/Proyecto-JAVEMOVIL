package com.puj.javemovil.model;

import java.util.ArrayList;

public class Prepago extends Cuenta{
    private long numeroMinutos;
    ArrayList<Recarga> recargarLlamadas;
    public Prepago(long numeroMinutos) {
        this.numeroMinutos = numeroMinutos;
        this.recargarLlamadas = new ArrayList<>();
    }
    public long getNumeroMinutos() {
        return numeroMinutos;
    }
    public void setNumeroMinutos(long numeroMinutos) {
        this.numeroMinutos = numeroMinutos;
    }
    public ArrayList<Recarga> getRecargarLlamadas() {
        return recargarLlamadas;
    }
    public void setRecargarLlamadas(ArrayList<Recarga> recargarLlamadas) {
        this.recargarLlamadas = recargarLlamadas;
    }

}
