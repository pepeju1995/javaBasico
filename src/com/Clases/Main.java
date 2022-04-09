package com.Clases;

public class Main {
    public static void main(String[] args) {
        SmartPhone telefono = new SmartPhone("Xiaomi", "Redmi 8", "OLED", 6.15, 3.8,
                6.2, "AndroidOne", "Azul", true);
        SmartWatch reloj = new SmartWatch("Apple", "15", "LCD", 1.5, 0.8,
                1.4, "Montana", "L", "Rojo");
        System.out.println(telefono.toString());
        System.out.println(reloj.toString());

    }
}
