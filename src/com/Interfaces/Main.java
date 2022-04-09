package com.Interfaces;

public class Main {

    public static void main(String[] args) {
        CocheCRUD coche = new CocheCRUDImpl();
        coche.delete();
        coche.findAll();
        coche.save();
    }
}
