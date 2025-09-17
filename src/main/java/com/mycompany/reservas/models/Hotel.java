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
public class Hotel 
{
    private String codigo;
    private String nombre;
    private ArrayList<Habitacion> habitacionesDisponibles;

    public Hotel(String codigo, String nombre) 
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.habitacionesDisponibles = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Habitacion> getHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }
    
    public void agregarHabitacion(Habitacion habitacion)
    {
        habitacionesDisponibles.add(habitacion);
    }

    @Override
    public String toString() {
        return "Hotel{" + "codigo:" + codigo + ", nombre:" + nombre + '}';
    }
}
