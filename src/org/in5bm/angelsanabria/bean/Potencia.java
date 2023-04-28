/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.in5bm.angelsanabria.bean;

/**
 *
 * @author Angel Sanabria
 * @date 25/03/2022
 * @grade 5to Perito en Informatica B
 * @code IN5BM
 * @carnet 2021067
 */
public class Potencia extends Operacion {
     private static final char OPERADOR = '√';
    
    public Potencia(){
        
    }
    
    @Override
    public double operar(){
        setResultado(Math.pow(getNumero1(),getNumero2()));
        return getResultado();
    }
    
    @Override
    public double operar(double numero1, double numero2){
        setNumero1(numero1);
        setNumero2(numero2);
        setResultado(Math.pow(getNumero1(),getNumero2()));
        return getResultado();
    }
}
