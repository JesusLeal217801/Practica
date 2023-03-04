/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.practica.excepciones;

/**
 * Excepcion que ocurre cuando la persona no es mayor de edad.
 * @author Jesus Leal
 */
public class EdadException extends Exception {
    public EdadException(String errorMessage) {
        super(errorMessage);
    }
}
