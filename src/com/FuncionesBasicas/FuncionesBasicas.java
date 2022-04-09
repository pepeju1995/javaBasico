package com.FuncionesBasicas;

import java.util.Scanner;

public class FuncionesBasicas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el precio para calcular impuestos: ");
        double precio = s.nextDouble();
        System.out.println("El precio con IVA (21%) es: " + precioConIVA(precio));

    }

    public static double precioConIVA(double precio){
        return precio * 1.21;
    }

}
