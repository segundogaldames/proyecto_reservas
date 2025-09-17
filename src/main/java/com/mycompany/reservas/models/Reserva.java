/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservas.models;

/**
 *
 * @author segundo
 */
public class Reserva 
{
    private Hotel hotel;
    private Habitacion habitacion;

    public Reserva(Hotel hotel, Habitacion habitacion) {
        this.hotel = hotel;
        this.habitacion = habitacion;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    @Override
    public String toString() {
        return "Reserva{" + "hotel:" + hotel + ", habitacionReservada:" + habitacion + '}';
    }
}
