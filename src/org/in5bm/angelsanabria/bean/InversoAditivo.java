package org.in5bm.angelsanabria.bean;

/**
 *
 * @author Angel Sanabria
 * @date 22/03/2022
 * @grade 5to Perito en Informatica B
 * @code IN5BM
 * @carnet 2021067
 */

public class InversoAditivo extends Operacion {
     private static final char OPERADOR = '±';
    
    public InversoAditivo(){
        
    }
   
    
    @Override
    public double operar(){
        setResultado((getNumero1() * getNumero2()));
        return getResultado();
    }
    
    @Override
    public double operar(double resultado, double numero){
        setNumero1(resultado);
        setNumero2(numero);
        setResultado(getNumero1() * getNumero2());
        return getResultado();
    }

    
    }
