/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica01Controller;

import com.mycompany.practica01Modelo.Modelo;
import com.mycompany.practica01Vista.Calculadora;

/**
 *
 * @author Cristian
 */
public class Controlador {
    private Modelo modelo;
    private Calculadora vista;
    
    public Controlador(Calculadora vista) {
        this.vista  = vista;
        this.modelo = new Modelo();
    }
}
/*
TO-DO CONTROLLER
*/
