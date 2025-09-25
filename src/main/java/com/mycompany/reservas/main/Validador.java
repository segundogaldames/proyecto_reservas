/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservas.main;

/**
 *
 * @author segundo
 */
public class Validador 
{
    public static boolean NoVacio(String valor)
    {
        return valor != null && !valor.trim().isEmpty();
    }
    
    public static boolean rangoEntero(int valor, int min, int max)
    {
        return valor >= min && valor <= max;
    }
    
    public static boolean positivo(int valor)
    {
        return valor > 0;
    }
    
    public static boolean soloDigitos(String valor)
    {
        return valor != null && valor.matches("\\d+");
    }
}
