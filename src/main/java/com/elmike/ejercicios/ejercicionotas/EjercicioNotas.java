/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elmike.ejercicios.ejercicionotas;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class EjercicioNotas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        float nota;

        System.out.println("Ingrese su nota");

        nota = leer.nextFloat();

        if (nota >= 9.5 && nota <= 10.0) {
            System.out.println("receibe un 80% de beca");
        } else {
            System.out.println(" No receibe un 80% de beca");
        }
    }
}
