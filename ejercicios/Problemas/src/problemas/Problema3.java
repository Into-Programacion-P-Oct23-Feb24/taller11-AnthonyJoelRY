/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.*;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resultado;
        double n1;
        double n2;
        double n3;
        double n4;

        System.out.print("Ingrese nota#1 :");
        n1 = entrada.nextDouble();
        System.out.print("Ingrese nota#2 :");
        n2 = entrada.nextDouble();
        System.out.print("Ingrese nota#3 :");
        n3 = entrada.nextDouble();
        System.out.print("Ingrese nota#4 :");
        n4 = entrada.nextDouble();

        resultado = obtenerParametros(n1, n2, n3, n4);
        System.out.println("El promedio de las notas: "
                + n1 + ", " + n2 + ", " + n3 + ", " + n4 + " es " + resultado);
    }

    public static String obtenerParametros(double n1, double n2, double n3, double n4) {
        double promedio = (n1 + n2 + n3 + n4) / 4;

        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio <= 8) {
            return "Bueno";
        } else if (promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Promedio fuera de rango";
        }
    }

}
