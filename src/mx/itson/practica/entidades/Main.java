/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.practica.entidades;

import mx.itson.practica.excepciones.EdadException;
import mx.itson.practica.excepciones.VigenciaException;

/**
 *
 * @author lm
 */
public class Main {

    public static void main(String[] args) {
        Operacion op = new Operacion();

        try {
            boolean puedeVotar = op.puedeVotar(17);
        } catch (EdadException e) {
            System.out.println(e.getMessage());
        }

        try {
            boolean esVigente = op.credencialVigente(2023);
            if (esVigente) {
                System.out.println("Tu credencial esta vigente.");
            }

        } catch (VigenciaException ex) {
            System.err.println(ex.getMessage());
        }

    }
}
