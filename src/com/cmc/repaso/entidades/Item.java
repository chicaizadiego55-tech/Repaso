package com.cmc.repaso.entidades;

public class Item {

    public String nombre;
    public int productosActuales;
    public int productosDevueltos;
    public int productosVendidos;

    public void imprimir() {

        System.out.println("Producto: " + nombre);
        System.out.println("Actuales: " + productosActuales);
        System.out.println("Vendidos: " + productosVendidos);
        System.out.println("Devueltos: " + productosDevueltos);
        System.out.println();

    }

    public void vender(int cantidad) {

        productosActuales = productosActuales - cantidad;
        productosVendidos = productosVendidos + cantidad;

    }

    public void devolver(int cantidad) {

        productosActuales = productosActuales + cantidad;
        productosVendidos = productosVendidos - cantidad;
        productosDevueltos = productosDevueltos + cantidad;

    }

}