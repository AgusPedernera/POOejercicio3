/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación,
se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera 
a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, 
se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, 
si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el 
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion( ){
      Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el primer numero");
       this.numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
       this.numero2 = leer.nextInt();
    }
    
    public double sumar(Operacion op1){
        return numero1+numero2;
    }
    
    public double restar(Operacion op1){
        return numero1-numero2;
    }
    
    public double multiplicar (Operacion op1){
        if (numero1==0 || numero2==0) {
            System.out.println("Error, estas multiplicando por 0");
            return 0;
           
        }else{
            return numero1*numero2;
        }
    }
    
    public double dividir (Operacion op1){
        if (numero1==0 || numero2==0) {
            System.out.println("Error, estas dividiendo por 0");
            return 0;
           
        }else{
            return numero1/numero2;
        }
    }

    
            
}
