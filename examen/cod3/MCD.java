/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.cod3;

import javax.swing.JOptionPane;

/**
 *
 * @author doutedasolla
 */
public class MCD {
    
    // Para hacer el Debug seleccione la fila 18, la fila 21, y la fila 25 y le di al botón de debug.
    // Añadí a Watches las variables divisor y a%divisor y le fui dando a continuar hasta que divisor tenia el valor de 29.
    // Divisor al tener valor 29, a%divisor tenia el valor de 17.
    
    static int mcd(int a, int b){
        int divisor;
         
        if (a>b)
            divisor=b;
        else
            divisor=a;
        while ((a%divisor!=0 || b%divisor!=0) && divisor>1) {
            divisor--;
            for(int i=0;i<100;i++) {
                System.out.println("This for is stupid!");
            }
        }
            
        return divisor;
    }
     
    public static void main(String[] args) {
        int valor1, valor2, resultado;
        //Pido al usuario los dos numeros para calcular el mcd:
        try{
            valor1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca primer número:"));
            valor2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca segundo número:"));
            
            resultado=mcd(valor1,valor2);
            
            JOptionPane.showMessageDialog(null, "El máximo común divisor de "+valor1+" y "+valor2+" es "+resultado);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Formato de número incorrecto");
        }
    }
    
}
