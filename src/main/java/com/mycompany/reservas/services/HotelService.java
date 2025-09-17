/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservas.services;

import com.mycompany.reservas.models.Hotel;
import com.mycompany.reservas.models.Habitacion;
import java.util.ArrayList;
/**
 *
 * @author segundo
 */
public class HotelService 
{
    private ArrayList<Hotel> hoteles;
    
    public HotelService()
    {
        hoteles = new ArrayList<>();
    }
    
    public void agregarHotel(Hotel hotel)
    {
        hoteles.add(hotel);
    }

    public ArrayList<Hotel> getHoteles() {
        return hoteles;
    }
    
    public void listarHoteles()
    {
        if(hoteles.isEmpty()){
            System.out.println("No hay hoteles registrados");
        }else{
            for(Hotel hotel : hoteles){
                System.out.println(hotel);
                for(Habitacion habitacion : hotel.getHabitacionesDisponibles()){
                    System.out.println(" - " + habitacion);
                }
            }
        }
    }
}
