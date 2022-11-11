package edu.cibertec.ejemplos.app01.calculadora;

import java.util.Scanner;



public class CalculadoraConEntrada {
    
    public static void main(String[] args) {
        //INICIO
        //1.Declaracion de variables
            int num1, num2,resultadoSuma, resultadoResta, resultadoMulti, resultadoDivi;
                     
               
        //2.Entrada de datos
        //voy a utilizar un componente especializado para la lectura
        Scanner lector = new Scanner(System.in);
        imprimir("ingrese primer numero: ");
        num1 = lector.nextInt();
        imprimir("ingrese segundo numero: ");
        num2 = lector.nextInt();
        //cierro el enlace para la lectura de datos
        lector.close();
        //3.Proceso de calculo            

        
        //4.Salida de resultados
               imprimir("el resultado de la suma es: " + sumar(num1, num2));
               imprimir("el resultado de la resta es: "+ resta(num1, num2));
               imprimir("el resultado de la multiplicacion es: "+ multi(num1, num2));
               imprimir("el cociente de la division es: "+ divi(num1, num2));
        
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
