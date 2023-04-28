
package org.in5bm.angelsanabria.bean;

public class Porcentaje extends Operacion {
     private static final char OPERADOR = '%';
    
    public Porcentaje(){
        
    }
    
    public Porcentaje(double numero1, double numero2){
        super(numero1,numero2,OPERADOR);
        operar();
    }
    
     @Override
    public double operar(){
        this.setResultado((this.getNumero1() * this.getNumero2())/100);
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
