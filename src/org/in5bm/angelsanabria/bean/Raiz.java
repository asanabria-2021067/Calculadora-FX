package org.in5bm.angelsanabria.bean;

/**
 *
 * @author Angel Sanabria
 * @date 25/03/2022
 * @grade 5to Perito en Informatica B
 * @code IN5BM
 * @carnet 2021067
 */
public class Raiz extends Operacion {
     private static final char OPERADOR = '√';
    
    public Raiz(){
        
    }
    
    @Override
    public double operar(){
        this.setResultado(Math.pow(this.getNumero1(),this.getNumero2()));
        return this.getResultado();
    }
    
    @Override
    public double operar(double numero1, double numero2){
        this.setNumero1(numero1);
        this.setNumero2(numero2);
        this.setResultado(Math.pow(this.getNumero1(),this.getNumero2()));
        return this.getResultado();
    }
        
}
