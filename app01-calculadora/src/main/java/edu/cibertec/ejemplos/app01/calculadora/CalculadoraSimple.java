package edu.cibertec.ejemplos.app01.calculadora;



public class CalculadoraSimple {
    
    public static void main(String[] args) {
        //INICIO
        //1.Declaracion de variables
            int num1;
            int num2;
            int resultadoSuma;
            int resultadoResta;
            int resultadoMulti;
            int resultadoDivi;
                     
               
        //2.Entrada de datos
            num1= 8;
            num2= 2;       
        
        
        //3.Proceso de calculo
            
            resultadoSuma= num1+num2;
            resultadoResta= num1-num2;
            resultadoMulti= num1*num2;
            resultadoDivi= num1/num2;
        
        //4.Salida de resultados
               System.out.println("el resultado de la suma es: " + resultadoSuma);
               System.err.println("el resultado de la resta es: "+ resultadoResta);
               System.err.println("el resultado de la multiplicacion es: "+ resultadoMulti);
               System.err.println("el cociente de la division es: "+ resultadoDivi);
        
        //Fin
    }
    
    
    
    
    
}
