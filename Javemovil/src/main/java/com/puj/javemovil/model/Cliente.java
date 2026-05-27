package com.puj.javemovil.model;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String identificacion;
    private String tipoId;
    private String direccion;
    ArrayList<Cuenta> cuentas;
    public Cliente(String nombre, String identificacion, String tipoId, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoId = tipoId;
        this.direccion = direccion;
        this.cuentas = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
