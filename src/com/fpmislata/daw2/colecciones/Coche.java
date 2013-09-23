/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.colecciones;

/**
 *
 * @author alumno
 */
public class Coche {

    private Marca marca;
    private String modelo;
    private int cilindrada;
    private Persona propietario;

    public Coche() {
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    //Metodos
    
    public String getInformacionCoche() {

        String informacionCoche = " Marca: " + this.marca + " \n Modelo: " + this.modelo + "\n Cilindrada: " + this.cilindrada + "\n Propietario: " + this.propietario.getDni();

        return informacionCoche;
    }
}
