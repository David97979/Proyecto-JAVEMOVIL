package com.puj.javemovil.model;

import java.util.ArrayList;

public class Empresa implements IEmpresa {
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Cuenta> cuentas;
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

}
