/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservas.models;

/**
 *
 * @author segundo
 */
public class Habitacion 
{
    private String numero;
    private int precio;
    private boolean disponible;

    public Habitacion(String numero, int precio, boolean disponible) {
        this.numero = numero;
        this.precio = precio;
        this.disponible = disponible;
    }

    public String getNumero() {
        return numero;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numero:" + numero + ", precio:" 
                + precio + ", disponible:" + disponible + '}';
    }
}
