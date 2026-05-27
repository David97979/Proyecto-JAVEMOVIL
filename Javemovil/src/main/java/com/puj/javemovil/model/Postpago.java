package com.puj.javemovil.model;

public class Postpago extends Cuenta{
    private long cargoFijo;
    public Postpago(long cargoFijo) {
        this.cargoFijo = cargoFijo;
    }
    public long getCargoFijo() {
        return cargoFijo;
    }
    public void setCargoFijo(long cargoFijo) {
        this.cargoFijo = cargoFijo;
    }
     @Override
    public long obtenerPagoCuenta() {
        long totalPago = cargoFijo;
        for (Llamada llamada : getLlamadas()) {
            totalPago += llamada.CalularValorLlamada();


}
