/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservas.models;

import java.util.ArrayList;

/**
 *
 * @author segundo
 */
public class Cliente 
{
    private String codigo;
    private String nombre;
    private ArrayList<Reserva> reservasRealizadas;

    public Cliente(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.reservasRealizadas = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Reserva> getReservasRealizadas() {
        return reservasRealizadas;
    }
    
    public void agregarReserva(Reserva reserva)
    {
        reservasRealizadas.add(reserva);
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo:" + codigo + ", nombre:" + nombre + '}';
    }
}
