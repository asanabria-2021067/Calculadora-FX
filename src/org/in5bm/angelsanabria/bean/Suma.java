package org.in5bm.angelsanabria.bean;

/**
 *
 * @author Angel Sanabria
 * @date 3/03/2022
 * Grado: 5to Perito en Informatica
 * Seccion: B
 * Grupo: 1
 */
public class Suma extends Operacion {
    
    private static final char OPERADOR = '+';
    
    public Suma(){
        
    }
    
    public Suma(double numero1, double numero2){
        super(numero1,numero2,OPERADOR);
        operar();
    }
    
    @Override
    public double operar(){
        this.setResultado(this.getNumero1() + this.getNumero2());
        return this.getResultado();
    }
    
    @Override
    public double operar(double numero1, double numero2){
        this.setNumero1(numero1);
        this.setNumero2(numero2);
        this.setOperador(OPERADOR);
        return this.operar();
    }
}

