/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.practica.entidades;

import mx.itson.practica.excepciones.EdadException;
import mx.itson.practica.excepciones.VigenciaException;

/**
 * Las operaciones que se pueden hacer en el proyecto.
 * @author Jesus Leal
 */
public class Operacion {    
    
    /**
     * Un metodo que nos permite saber si la persona es apta para votar.
     * @param edad Edad de la persona.
     * @return Un true si puede votar y un false si no puede.
     * @throws EdadException 
     */
    public boolean puedeVotar(int edad) throws EdadException {
        if (edad < 18) {
            throw new EdadException("Debes de ser mayor de edad para votar");
        } else {
            return true;
        }
    }
    
    /**
     * Metodo que nos permite saber si la credencial es vigente o no.
     * @param anioVigencia Año de vigencia de la credencial.
     * @return Un true si es vigente y un false si no lo es.
     * @throws VigenciaException 
     */
    public boolean credencialVigente(int anioVigencia) throws VigenciaException{
        if(anioVigencia < 2023){
            throw new VigenciaException("Tu credencial no esta vigente.");
        }
        return true;
    }
    
}
