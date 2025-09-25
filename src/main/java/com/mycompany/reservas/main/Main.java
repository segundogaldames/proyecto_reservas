/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservas.main;

import com.mycompany.reservas.models.*;
import com.mycompany.reservas.services.*;
import com.mycompany.reservas.main.Validador;
import java.util.Scanner;
/**
 *
 * @author segundo
 */
public class Main 
{
    private int opcion;
    HotelService hotelService;
    ClienteService clienteService;
    ReservaService reservaService;
    Scanner scanner;
    
    public Main()
    {
        hotelService = new HotelService();
        clienteService = new ClienteService();
        reservaService = new ReservaService();
        scanner = new Scanner(System.in);
    }
    
    public void menu()
    {
        do {
            System.out.println("****Menu de Opciones****");
            System.out.println("1. Registrar Hotel");
            System.out.println("2. Registrar Cliente");
            System.out.println("3. Listar Hoteles");
            System.out.println("4. Realizar Reserva");
            System.out.println("5. Listar Reservas de Cliente");
            System.out.println("0. Salir");
            
            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion){
                case 1 -> registrarHotel();
                case 2 -> registrarCliente();
                case 3 -> hotelService.listarHoteles();
                case 4 -> realizarReserva();
                case 5 -> listarReservasCliente();
                case 0 -> salir();
                default -> error();
            }
            
        } while (opcion != 0);
    }
    
    private void registrarHotel()
    {
        String codigo, nombre, cantidad, numero;
        int precio;
        do {
            System.out.println("Ingrese el codigo del hotel: ");
            codigo = scanner.nextLine();
        } while (!Validador.NoVacio(codigo));
        
        do {
            System.out.println("Ingrese el nombre del hotel: ");
            nombre = scanner.nextLine();
        } while (!Validador.NoVacio(nombre));
        
        Hotel hotel = new Hotel(codigo, nombre);
        
        do {
            System.out.println("Ingrese el numero de habitaciones del hotel: ");
            cantidad = scanner.nextLine();
        } while (!Validador.soloDigitos(cantidad));
        
        int valor = Integer.parseInt(cantidad);
        for (int i = 1; i <= valor; i++) {
            do {
                System.out.println("Ingrese el numero de la habitacion: ");
                numero = scanner.nextLine();
            } while (!Validador.NoVacio(numero));
            
            do {
                System.out.println("Ingrese el precio de la habitacion: ");
                precio = scanner.nextInt();
                scanner.nextLine();
            } while (!Validador.positivo(precio));
            
            Habitacion habitacion = new Habitacion(numero, precio, true);
            hotel.agregarHabitacion(habitacion);
        }
         
        hotelService.agregarHotel(hotel);
    }
    
    private void registrarCliente()
    {
        String codigo, nombre;
        
        do {
            System.out.println("Ingrese el codigo del cliente: ");
            codigo = scanner.nextLine();
        } while (!Validador.NoVacio(codigo));
        
        do {
            System.out.println("Ingrese el nombre del cliente: ");
            nombre = scanner.nextLine();
        } while (!Validador.NoVacio(nombre));
        
        Cliente cliente = new Cliente(codigo, nombre);
        clienteService.agregarCliente(cliente);
    }
    
    private void realizarReserva()
    {
        String codigoCliente;
        clienteService.listarClientes();
        do {
            System.out.println("Ingrese el codigo de cliente: ");
            codigoCliente = scanner.nextLine();
        } while (!Validador.NoVacio(codigoCliente));
        
        Cliente cliente = null;
        for(Cliente cl : clienteService.getClientes()){
            if(cl.getCodigo().equals(codigoCliente)){
               cliente = cl;
               break;
            }
        }
        
        if(cliente == null){
            System.out.println("Cliente no encontrado: ");
            return;
        }
        
        hotelService.listarHoteles();
        String codigoHotel;
        do {
            System.out.println("Ingrese el codigo del hotel: ");
            codigoHotel = scanner.nextLine();
        } while (!Validador.NoVacio(codigoHotel));
        
        Hotel hotel = null;
        for(Hotel h : hotelService.getHoteles()){
            if(h.getCodigo().equals(codigoHotel)){
               hotel = h;
               break;
            }
        }
        
        if(hotel == null){
            System.out.println("Hotel no encontrado: ");
            return;
        }
        
        String numHabitacion;
        do {
            System.out.println("Ingrese el numero de la habitacion: ");
            numHabitacion = scanner.nextLine();
        } while (!Validador.NoVacio(numHabitacion));
        
        Habitacion habitacion = null;
        for(Habitacion hab : hotel.getHabitacionesDisponibles()){
            if(hab.getNumero().equals(numHabitacion)){
               habitacion = hab;
               break;
            }
        }
        
        if(habitacion == null){
            System.out.println("Habitacion no encontrada: ");
            return;
        }
        
        reservaService.agregarReserva(cliente, hotel, habitacion);
    }
    
    private void listarReservasCliente()
    {
        String codigoCliente;
        clienteService.listarClientes();
        do {
            System.out.println("Ingrese el codigo de cliente: ");
            codigoCliente = scanner.nextLine();
        } while (!Validador.NoVacio(codigoCliente));
        
        Cliente cliente = null;
        for(Cliente cl : clienteService.getClientes()){
            if(cl.getCodigo().equals(codigoCliente)){
               cliente = cl;
               break;
            }
        }
        
        if(cliente == null){
            System.out.println("Cliente no encontrado: ");
            return;
        }
        
        reservaService.listarReservasCliente(cliente);
    }
    
    private void salir()
    {
        System.out.println("Gracias por usar nuestro sistema");
    }
    
    private void error()
    {
        System.out.println("Ingrese una opcion valida");
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }
}
