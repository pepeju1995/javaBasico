package com.Clases;

public class SmartPhone extends SmartDevice{
    String color;
    Boolean tieneFunda;

    public SmartPhone(){}

    public SmartPhone(String marca, String modelo,String tipoPantalla, double largoPantalla,
                      double anchoPantalla, double pulgadas, String sistemaOperativo, String color, Boolean tieneFunda){
        super(marca, modelo, tipoPantalla, largoPantalla, anchoPantalla, pulgadas, sistemaOperativo);
        this.color = color;
        this.tieneFunda = tieneFunda;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getTieneFunda() {
        return tieneFunda;
    }

    public void setTieneFunda(Boolean tieneFunda) {
        this.tieneFunda = tieneFunda;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "color='" + color + '\'' +
                ", tieneFunda=" + tieneFunda +
                "} " + super.toString();
    }
}
