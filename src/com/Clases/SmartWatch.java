package com.Clases;

public class SmartWatch extends SmartDevice{
    String tamanioCorrea;
    String colorCorrea;

    public SmartWatch(){}

    public SmartWatch(String marca, String modelo,String tipoPantalla, double largoPantalla,
                      double anchoPantalla, double pulgadas, String sistemaOperativo, String tamanioCorrea, String colorCorrea){
        super(marca, modelo, tipoPantalla, largoPantalla, anchoPantalla, pulgadas, sistemaOperativo);
        this.tamanioCorrea = tamanioCorrea;
        this.colorCorrea = colorCorrea;
    }

    public String getTamanioCorrea() {
        return tamanioCorrea;
    }

    public void setTamanioCorrea(String tamanioCorrea) {
        this.tamanioCorrea = tamanioCorrea;
    }

    public String getColorCorrea() {
        return colorCorrea;
    }

    public void setColorCorrea(String colorCorrea) {
        this.colorCorrea = colorCorrea;
    }

    @Override
    public String   toString() {
        return "SmartWatch{" +
                "tamanioCorrea='" + tamanioCorrea + '\'' +
                ", colorCorrea='" + colorCorrea + '\'' +
                "} " + super.toString();
    }
}
