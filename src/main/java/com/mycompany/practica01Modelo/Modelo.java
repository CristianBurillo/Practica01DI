/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica01Modelo;

/**
 *
 * @author Cristian
 */


public class Modelo {
   
    private float num1;
    private float num2;

    
//constructor vacio
    public Modelo(){}
    //getters y setters

    public float getNum1() {
        return num1;
    }
    public void setNum1(float num1) {
        this.num1 = num1;
    }
    public float getNum2() {
       return num2;
    }
    public void setNum2(float num2) {
        this.num2 = num2;
    }

//method de las operaciones
    
    //suma
    public float suma() {
        num1 = num1 + num2;
        return num1;
    }
    public float multiplicacion() {
      num1 *= num2; //repasar
      return num1;
    }
    public float resta() {
        num1 -= num2;
        return num1;
    }
    public float division() {
        //Excepcion/0
      num1 /= num2;
      return num1;
    }
   
    public void limpiar() {
        this.num1 = 0;
    }

    @Override
    public String toString(){
        return Float.toString(num1);
    }
}
