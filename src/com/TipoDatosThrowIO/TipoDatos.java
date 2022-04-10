package com.TipoDatosThrowIO;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TipoDatos {

    public static void main(String[] args) {
        //Funcion reverse String
        System.out.println(TipoDatos.reverse("Hola Mundo"));

        //1.Recorrer y mostrar Array Unidimensional
        String[] cadenas = {"Hola ", "mi ", "nombre ", "es ", "Jose ", "Juan"};
        for(String palabra : cadenas){
            System.out.print(palabra);
        }

        //2.Array Bidimensional de enteros
        int[][] dosDimensiones = {
                {5,9,8},
                {7,8,3},
                {1,2,4}
        };
        for (int i = 0; i < dosDimensiones.length; i++){
            for (int j = 0; j < dosDimensiones[i].length; j++){
                System.out.println("En la posicion [" + i + "][" + j + "] tengo el numero: " + dosDimensiones[i][j]);
            }
        }

        //3.Crea vector y elimina elementos
        Vector<Double> decimales = new Vector<Double>();
        decimales.add(5.69);
        decimales.add(9.87);
        decimales.add(7.68);
        decimales.add(2.1);
        decimales.add(6.4);
        decimales.remove(1);
        decimales.remove(2);
        for(double decimal : decimales){
            System.out.println(decimal);
        }

        //4.Problema de Vector
        /*
        * El problema de utilizar Vector es que su capacidad por defecto es 10 y se ira duplicando la capacidad cada vez
        * que se llene, al duplicarlo llegamos a tener nuestro primer vector y el nuevo al mismo tiempo mientras se copia
        * un Vector en otro por lo que esto supondria un uso excesivo de memoria, si sabemos de antemano el tamaño que
        * necesitamos lo ideal seria inicializar a ese tamaño el Vector.
        *
        * */

        //5.ArrayList To LinkedList
        ArrayList<String> array = new ArrayList<String>();
        LinkedList<String> linked = new LinkedList<String>();
        array.add("Jose");
        array.add("Juan");
        array.add("Perez");
        for(String palabra : array){
            linked.add(palabra);
        }
        for(int i = 0; i < array.size(); i++){
            System.out.println("Valor de ArrayList: " + array.get(i) + "\nValor de LinkedList: " + linked.get(i));
        }

        //6.ArrayList relleno con bucle
        ArrayList<Integer> bucle = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++){
            bucle.add(i);
        }
        int recorre = 0;
        while (recorre < bucle.size()){
            if(bucle.get(recorre) % 2 == 0){
                bucle.remove(recorre);
            } else{
                System.out.println(bucle.get(recorre));
                recorre ++;
            }
        }

        //7.DividePorCero
        try{
            dividePorCero();
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Demo de codigo");
        }

        //8.Copia archivo
        String entrada = "Entrada.txt";
        String salida = "Salida.txt";
        copiaArchivo(entrada, salida);
    }

    public static String reverse (String texto){
        String reverseText = "";
        for(int i = texto.length()-1; i >= 0; i--){
            reverseText += texto.charAt(i);
        }
        return reverseText;
    }

    public static Exception dividePorCero(){
        ArithmeticException e = new ArithmeticException("Esto no se puede hacer");

        throw e;
    }

    public static void copiaArchivo (String fileIn, String fileOut){
        try {
            InputStream ficheroEntrada = new FileInputStream(fileIn);
            PrintStream ficheroSalida = new PrintStream(fileOut);
            try{
                byte[] datos = ficheroEntrada.readAllBytes();
                ficheroEntrada.close();

                ficheroSalida.write(datos);
                ficheroSalida.close();
            } catch (IOException e){
                System.out.println("Error en la lectura de datos");
            }

        } catch (FileNotFoundException e){
            System.out.println("Error en la apertura de archivos" + e.getMessage());
        }
        System.out.println("Copia de " + fileIn + " en " + fileOut + " completada con exito.");
    }
}
