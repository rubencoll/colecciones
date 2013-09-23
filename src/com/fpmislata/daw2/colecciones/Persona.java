/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private Sexo sexo;
    List<Coche> coches = new ArrayList<>();

    //Constructor vacio
    public Persona() {
    }

    //Constructor Sobrecargado
    public Persona(String dni, String nom, String ape, Sexo sex) {
        this.dni = dni;
        this.nombre = nom;
        this.apellido = ape;
        this.sexo = sex;
        this.coches = new ArrayList<>();
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Coche> getListaCoches() {
        return coches;
    }

    public void setcoches(List<Coche> listaCoches) {
        this.coches = listaCoches;
    }

    //Metodos
    
    public String getNombreCompleto() {

        String nombreCompleto = this.nombre + " " + this.apellido + " " + this.sexo;

        return nombreCompleto;
    }
}
