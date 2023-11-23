/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_factorial;

/**
 *
 * @author invitado
 */
public class EVA3_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 5;
        System.out.println("Factorial de 5 = " + calcularFactorial(valor));
        
        int result = 3;
        System.out.println("3 elevado a la 3 =  " + calcularPotencia(result));
        
        
    }
    public static int calcularFactorial(int valor) {
       
        int guardar = 1;
        for (int i = 1; i <= valor; i++) {
            guardar *= i; 
            
        }
        return guardar;
    }
    
     public static int calcularPotencia(int valor2) {
       
        int base = 3, potencia = 3;
        int result = 1;
        // running loop while the power > 0
        while (potencia != 0) {
            result = result * base;
            // power will get reduced after
            // each multiplication
            potencia--;
        
            
        }
        return result;
    }
    
}
