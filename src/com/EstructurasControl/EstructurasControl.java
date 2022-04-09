package com.EstructurasControl;

import java.util.ArrayList;
import java.util.List;

public class EstructurasControl {

    public static void main(String[] args) {
        List<String> cadenas = new ArrayList<>();
        cadenas.add("Hola ");
        cadenas.add("mi nombre es ");
        cadenas.add("Jose Juan");
        System.out.println(concatenaCadenas(cadenas));
    }

    static String concatenaCadenas(List<String> cadenas){
        String result = "";
        for (String cadena : cadenas) {
            result += cadena;
        }
        return result;
    }
}
