package edu.cibertec.ejemplos.app01.calculadora;



public class CalculadoraConMetodos {
    
    public static void main(String[] args) {
        //INICIO
        //1.Declaracion de variables
            int num1, num2,resultadoSuma, resultadoResta, resultadoMulti, resultadoDivi;
                     
               
        //2.Entrada de datos
            num1= 8;
            num2= 2;       
        
        
        //3.Proceso de calculo            
            resultadoSuma= sumar(num1, num2);
            resultadoResta= resta(num1, num2);
            resultadoMulti= multi(num1, num2);
            resultadoDivi= divi(num1, num2);
        
        //4.Salida de resultados
               imprimir("el resultado de la suma es: " + resultadoSuma);
               imprimir("el resultado de la resta es: "+ resultadoResta);
               imprimir("el resultado de la multiplicacion es: "+ resultadoMulti);
               imprimir("el cociente de la division es: "+ resultadoDivi);
        
        //Fin
    }
    //definimos metodos
    public static int sumar(int num1, int num2) {
        int resultado;
        resultado= num1+num2;
        return resultado;    
    }    
    public static int resta(int num1, int num2) {
        int resultado;
        resultado= num1-num2;
        return resultado;        
    }
    public static int multi(int num1, int num2) {
        int resultado;
        resultado= num1*num2;
        return resultado;
    }
    public static int divi(int num1, int num2) {
        int resultado;
        resultado=num1/num2;
        return resultado;
    }
    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
        
    }
}
