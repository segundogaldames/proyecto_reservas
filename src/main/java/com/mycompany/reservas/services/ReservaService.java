/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservas.services;

import com.mycompany.reservas.models.Cliente;
import com.mycompany.reservas.models.Hotel;
import com.mycompany.reservas.models.Habitacion;
import com.mycompany.reservas.models.Reserva;
/**
 *
 * @author segundo
 */
public class ReservaService 
{
    public void agregarReserva(Cliente cliente, Hotel hotel, Habitacion habitacion) 
    {
        if(habitacion.isDisponible()){
            Reserva reserva = new Reserva(hotel, habitacion);
            cliente.agregarReserva(reserva);
            habitacion.setDisponible(false);
        }else{
            System.out.println("La habitación esta ocupada");
        } 
    }
    
    public void listarReservasCliente(Cliente cliente)
    {
        if(cliente.getReservasRealizadas().isEmpty()){
            System.out.println("El cliente no tiene reserva");
        }else{
            for(Reserva reserva : cliente.getReservasRealizadas()){
                System.out.println(reserva);
            }
        }
    }
}
