/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.practica.excepciones;

/**
 * Excepcion que ocurre cuando la credencial no es vigente.
 * @author Jesus Leal
 */
public class VigenciaException extends Exception {
    public VigenciaException(String errorMessage) {
        super(errorMessage);
    }
}
