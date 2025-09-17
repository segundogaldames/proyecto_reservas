/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservas.services;

import com.mycompany.reservas.models.Cliente;
import java.util.ArrayList;

/**
 *
 * @author segundo
 */
public class ClienteService 
{
    private ArrayList<Cliente> clientes;
    
    public ClienteService()
    {
        clientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public void listarClientes()
    {
        if(clientes.isEmpty()){
            System.out.println("No hay clientes registrados");
        }else{
            for(Cliente cliente : clientes){
                System.out.println(cliente);
            }
        }
    }
}
