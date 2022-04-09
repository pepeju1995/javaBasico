package com.Interfaces;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void delete() {
        System.out.println("CocheCRUD delete");
    }

    @Override
    public void findAll() {
        System.out.println("CocheCRUD findAll");
    }

    @Override
    public void save() {
        System.out.println("CocheCRUD save");
    }
}
