package com.Clases;

public class SmartDevice {
    private String marca;
    private String modelo;
    private String tipoPantalla;
    private double largoPantalla;
    private double anchoPantalla;
    private double pulgadas;
    private String sistemaOperativo;

    public SmartDevice(){}

    public SmartDevice(String marca, String modelo,String tipoPantalla, double largoPantalla, double anchoPantalla, double pulgadas, String sistemaOperativo){
        this.marca = marca;
        this.modelo = modelo;
        this.tipoPantalla = tipoPantalla;
        this.largoPantalla = largoPantalla;
        this.anchoPantalla = anchoPantalla;
        this.pulgadas = pulgadas;
        this.sistemaOperativo = sistemaOperativo;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public double getLargoPantalla() {
        return largoPantalla;
    }

    public double getAnchoPantalla() {
        return anchoPantalla;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public void setLargoPantalla(double largoPantalla) {
        this.largoPantalla = largoPantalla;
    }

    public void setAnchoPantalla(double anchoPantalla) {
        this.anchoPantalla = anchoPantalla;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoPantalla='" + tipoPantalla + '\'' +
                ", largoPantalla=" + largoPantalla +
                ", anchoPantalla=" + anchoPantalla +
                ", pulgadas=" + pulgadas +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}
