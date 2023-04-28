
package org.in5bm.angelsanabria.controller;
import org.in5bm.angelsanabria.bean.Porcentaje;
import org.in5bm.angelsanabria.bean.Multiplicacion;
import org.in5bm.angelsanabria.bean.Division;
import org.in5bm.angelsanabria.bean.Resta;
import org.in5bm.angelsanabria.bean.Suma;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import org.in5bm.angelsanabria.bean.InversoAditivo;
import org.in5bm.angelsanabria.bean.InversoMultiplicativo;
import org.in5bm.angelsanabria.bean.Operacion;
import org.in5bm.angelsanabria.bean.Potencia;
import org.in5bm.angelsanabria.bean.Raiz;
import org.in5bm.angelsanabria.bean.Salida;
/**
 *
 * @author Angel Sanabria
 * @date 19-02-2022
 * @grade 5to Perito en Informatica B
 * @code IN5BM
 * @carnet 2021067
 */
public class FXMLCalculadoraController implements Initializable{
    Salida s = new Salida();
    private double resultado = 0;
    private double numero= 0;
    private int contadorOperadores = 0;
    private String operadorAnterior;
    private boolean ingresoNuevo = false;
    
    
    @FXML
    private Label lblPantalla;
    @FXML
    private Label lblHistorial;
    @FXML
    private Button btnPunto;
    @FXML
    private Button btnSuma;
    @FXML
    private Button btnLimpiar;
    @FXML
    private Button btnResta;
    @FXML
    private Button btnPorcentaje;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnMultiplicar;
    @FXML
    private Button btnCero;
    @FXML
    private Button btnUno;
    @FXML
    private Button btnDos;
    @FXML
    private Button btnTres;
    @FXML
    private Button btnCuatro;
    @FXML
    private Button btnCinco;
    @FXML
    private Button btnSeis;
    @FXML
    private Button btnSiete;
    @FXML
    private Button btnOcho;
    @FXML
    private Button btnNueve;
    @FXML
    private Button btnInversoAditivo;
    @FXML
    private Button btnDividir;
    @FXML
    private Button btnInversoMultiplicativo;
    @FXML
    private Button btnRaiz;
    @FXML
    private Button btnExponente;
    @FXML
    private Button btnDelete;   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    @FXML
    private void historialPantalla(){
        try{
        lblHistorial.setText(String.valueOf(s.getNumero1()).concat(" " + s.getOperador() + " ")
               .concat(String.valueOf(s.getNumero2())).concat(" " + "=" + " ").concat(String.valueOf(s.getResult())));
        }catch(NullPointerException e){
            
        }
        /*
        lblHistorial.setText(String.valueOf(s.getNumero1()));
        lblHistorial.setText(String.valueOf(s.getOperador()));
        lblHistorial.setText(String.valueOf(s.getNumero2()));
        lblHistorial.setText(String.valueOf("="));
        lblHistorial.setText(String.valueOf(s.getResult()));
       */
    }
    @FXML
    private void clicUno(ActionEvent event){
        actualizarPantalla("1");
    }
    @FXML
    private void clicDos(ActionEvent event){
        actualizarPantalla("2");
    }
    @FXML
    private void clicTres(ActionEvent event){
        actualizarPantalla("3");
    }
    @FXML
    private void clicCuatro(ActionEvent event){
        actualizarPantalla("4");
    }
    @FXML
    private void clicCinco(ActionEvent event){
        actualizarPantalla("5");
    }
    @FXML
    private void clicSeis(ActionEvent event){
        actualizarPantalla("6");
    }
    @FXML
    private void clicSiete(ActionEvent event){
        actualizarPantalla("7");
    }
    @FXML
    private void clicOcho(ActionEvent event){
        actualizarPantalla("8");
    }
    @FXML
    private void clicNueve(ActionEvent event){
        actualizarPantalla("9");
    }
    @FXML
    private void clicCero(ActionEvent event){
        try{
            agregarCero();
        }catch(NumberFormatException e){
            actualizarPantalla("0");
        }
    }
    public void agregarCero(){
        double num = Double.parseDouble(lblPantalla.getText());
        if (ingresoNuevo){
            lblPantalla.setText(" ");
        }
        
        String cadena = lblPantalla.getText();
        
        if(cadena.length() <=0){
            lblPantalla.setText("0");
            ingresoNuevo=false;
        }else if(!lblPantalla.getText().contains("0")){
            actualizarPantalla("0");
        }else if (num != 0){
            actualizarPantalla("0");
            ingresoNuevo=false;
        }else if (lblPantalla.getText().contains(("0."))){
            actualizarPantalla("0");
            ingresoNuevo=false;
        }
    }
    @FXML
    private void clicPunto(ActionEvent event){
        agregarPunto();
    }
    @FXML
    private void clickRaiz(ActionEvent event){
        contadorOperadores++;
        //resultado = 1;
        operadorAnterior="√";
        ingresoNuevo=false;
        calcular("√");
        
        
        
        
        /*
        Raiz r = new Raiz();
        r.setNumero1(resultado);
        this.resultado=Double.parseDouble(lblPantalla.getText());
        double num= r.operar(resultado);
        lblPantalla.setText(String.valueOf(num));
        */
        
    }
    @FXML
    private void clicExponente(ActionEvent event){
        contadorOperadores++;
        //resultado = 1;
        operadorAnterior="x²";
        ingresoNuevo=false;
        calcular("x²");
        /*
        Potencia p = new Potencia();
        p.setNumero1(resultado);
        this.resultado=Double.parseDouble(lblPantalla.getText());
        double num= p.operar(resultado);
        lblPantalla.setText(String.valueOf(num));
        */
    }
    @FXML
    private void clicInversoMultiplicativo(ActionEvent event){
        /*
        calcular("");
        ingresoNuevo=false;
        */
        contadorOperadores++;
        //resultado = 1;
        operadorAnterior="1/x";
        ingresoNuevo=false;
        calcular("1/x");
        
        
        /*
        InversoMultiplicativo in= new InversoMultiplicativo();
         this.resultado=Double.parseDouble(lblPantalla.getText());
         double num= in.operar(resultado);
         lblPantalla.setText(String.valueOf(num));
        */
    }
    @FXML
    private void clickDelete(ActionEvent event){
        String pantalla= lblPantalla.getText();
        int contador= pantalla.length();
        if(contador==0){
            lblPantalla.setText(" ");
        }else{
            pantalla=pantalla.substring(0,pantalla.length()-1);
            lblPantalla.setText(pantalla);
            resultado=Double.parseDouble(pantalla);
        }
        
    }    
 
    public void agregarPunto(){
        if (ingresoNuevo){
            lblPantalla.setText("");
        }
        
        String cadena = lblPantalla.getText();
        
        if(cadena.length()<= 0){
            lblPantalla.setText("0.");
            ingresoNuevo=false;
        }else if(!(lblPantalla.getText().contains("."))){
            actualizarPantalla(".");
        }
    }

    public void actualizarPantalla(String digito){
        if (ingresoNuevo){
            lblPantalla.setText("");
        }
        lblPantalla.setText(lblPantalla.getText().concat(digito));
        ingresoNuevo=false;
    }
    @FXML
    private void clicSuma(ActionEvent event){
        calcular("+");
    }
    @FXML
    private void clicResta(ActionEvent event){
        calcular("-");
    }
    @FXML
    private void clicMultiplicacion(ActionEvent event){
        calcular("*");
    }
    @FXML
    private void clicDivision(ActionEvent event){
        calcular("/");
    }
    @FXML
    private void clicPorcentaje(ActionEvent event){
        calcular("%");
    }
    @FXML
    private void clicInversoA(ActionEvent event){
        contadorOperadores++;
        operadorAnterior="±";
        resultado = 1;
        ingresoNuevo= false;
        calcular("±");
        
        
        
        /*
        InversoAditivo i= new InversoAditivo();
        double num = this.numero;
        numero = i.operar(Double.parseDouble(lblPantalla.getText()));
        lblPantalla.setText(String.valueOf(numero));
        lblHistorial.setText(String.valueOf(num).concat(s.getOperador())
              .concat(String.valueOf(resultado * -1)).concat("=").concat(String.valueOf(numero)));
       
        */
        /* i.setNumero2(numero);
           i.setInverso(inverso);
           this.resultado = i.inversar(i.getResultado(), i.getInverso());
           System.out.println("Resultado: "+this.resultado);
           lblPantalla.setText(String.valueOf(this.resultado));
        */
        /*
        this.resultado= this.resultado*-1;
        System.out.println("Resultado: "+this.resultado);
        lblPantalla.setText(String.valueOf(this.resultado));
        */
    }
    @FXML
    private void clicLimpiar(ActionEvent event){
        limpiar();
        resultado= 0.0;
        numero= 0.0;
        contadorOperadores= 0;
        operadorAnterior= " ";
        ingresoNuevo= false;
    }
    public void limpiar(){
        lblPantalla.setText("");
    }
    @FXML
    private void clicIgual(ActionEvent event){
        try{
        calcular(this.operadorAnterior);
        lblPantalla.setText(String.valueOf(this.resultado));
        operadorAnterior= "";
        }catch(NumberFormatException e){
            
        }

    }
    
    private void calcular(String operador){
        //this.operadorAnterior=operador;
        s.setOperador(operador);
        System.out.println("\ncalcular()");
        System.out.println("Operador actual: "+operador);
        System.out.println("lblPantalla.getText(): "+ lblPantalla.getText());
        if(!(lblPantalla.getText().equals(""))){
            System.out.println("Dentro del primer If");
            String strPantalla = lblPantalla.getText();
            System.out.println("Ingreso nuevo: "+ingresoNuevo);
            
            
            
            if(ingresoNuevo == false){
               System.out.println("Dentro del segundo If");
               this.numero = Double.parseDouble(strPantalla);
               System.out.println("numero: "+numero);
               contadorOperadores++;
               System.out.println("contadorOperadores: "+contadorOperadores);
               
            if (contadorOperadores == 1){
                this.resultado=numero;
            }else if(contadorOperadores >= 2){
                s.setNumero1(resultado);
                s.setNumero2(numero);
                System.out.println("If del switch");
                Operacion calcu = null;
                switch(this.operadorAnterior){
                    case "+": 
                        calcu = new Suma();
                        calcu.setNumero1(resultado);
                        calcu.setNumero2(numero);
                        this.resultado = calcu.operar(calcu.getNumero1(), calcu.getNumero2());
                        break;
                    case "-": 
                        calcu = new Resta();
                        calcu.setNumero1(resultado);
                        calcu.setNumero2(numero);
                        this.resultado = calcu.operar(calcu.getNumero1(), calcu.getNumero2());
                        break;
                    case "*": 
                        calcu = new Multiplicacion(resultado, numero);
                        this.resultado = calcu.operar(calcu.getNumero1(), calcu.getNumero2());
                        break;
                    case "/": 
                        calcu= new Division(resultado, numero);
                        calcu.setNumero1(resultado);
                        
                        if (numero == 0){
                            //try{
                            System.out.println("Dentro del if comprobador");
                            String fallo = "MATH ERROR";
                            lblPantalla.setText(fallo);
                            this.resultado= Double.parseDouble("MATH ERROR");
                            //}catch(NumberFormatException e){
                             // e.printStackTrace(); 
                           // }
                           
                            
                        } else {
                            calcu.setNumero2(numero);
                            System.out.println("Dentro del else comprobador");
                        this.resultado = calcu.operar(calcu.getNumero1(), calcu.getNumero2());
                        }
                        break;
                    case "%":
                        calcu= new Porcentaje();
                        calcu.setNumero1(resultado);
                        calcu.setNumero2(numero);
                        this.resultado = calcu.operar(calcu.getNumero1(), calcu.getNumero2());
                        break; 
                    case "1/x":
                        calcu = new InversoMultiplicativo();
                        resultado = calcu.operar(1, numero);
                        
                     
                        /*
                        InversoMultiplicativo in= new InversoMultiplicativo();
                         this.resultado=Double.parseDouble(lblPantalla.getText());
                         double num= in.operar(resultado);
                         lblPantalla.setText(String.valueOf(num));
                        */
                        break;
                    case "±":
                        calcu = new InversoAditivo();
                        
                        this.resultado = calcu.operar(numero,-1);
                        
                        break;
                    case"√":
                        calcu = new Raiz();
                        this.resultado = calcu.operar(numero,0.5);
                        break;
                    case "x²":
                        calcu = new Potencia();
                        this.resultado = calcu.operar(numero, 2);
                        break;
                        
                }
                        
                }
                System.out.println("Resultado: "+this.resultado);
                lblPantalla.setText(String.valueOf(this.resultado));
                s.setResult(this.resultado);
                historialPantalla();
            }
            this.operadorAnterior=operador;
        }
        
        ingresoNuevo= true;
    }
   
}
        


