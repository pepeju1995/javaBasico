package com.IntroduccionJava1;

public class ImprimeTiposDatos {
    private int entero;
    private String cadenaTexto;
    private double granComaFlotante;
    private float comaFlotante;
    private boolean esVerdad;
    private char caracter;

    public ImprimeTiposDatos(int entero, String cadenaTexto, double granComaFlotante,
                             float comaFlotante, boolean esVerdad, char caracter){
        this.entero = entero;
        this.cadenaTexto = cadenaTexto;
        this.granComaFlotante = granComaFlotante;
        this.comaFlotante = comaFlotante;
        this.esVerdad = esVerdad;
        this.caracter = caracter;
    }

    @Override
    public String toString() {
        return "ImprimeTiposDatos{" +
                "INT=" + entero +
                ", STRING='" + cadenaTexto + '\'' +
                ", DOUBLE=" + granComaFlotante +
                ", FLOAT=" + comaFlotante +
                ", BOOLEAN=" + esVerdad +
                ", CHAR=" + caracter +
                '}';
    }

    public static void main(String[] args) {
        ImprimeTiposDatos tiposDatos = new ImprimeTiposDatos(2, "Hola Mundo", 5.26d,
                                                             6.58f, false, 'd');
        System.out.println(tiposDatos);
    }
}
