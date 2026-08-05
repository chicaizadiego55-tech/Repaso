package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

    public static void main(String[] args) {

        Validacion v = new Validacion();

        System.out.println(v.validarMonto(100));
        System.out.println(v.validarMonto(-50));

    }

}