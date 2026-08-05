package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

    public static void main(String[] args) {

        Producto p = new Producto("Arroz", 20);

        p.setPrecio(-30);

        System.out.println("Producto: " + p.nombre);
        System.out.println("Precio: " + p.precio);
        System.out.println("Precio con descuento: " + p.calcularPrecioPromo(10));

    }

}