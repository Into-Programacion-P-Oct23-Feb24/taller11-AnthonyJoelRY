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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.print("Ingrese el proceso que desea realizar:");
        x = entrada.nextInt();
        if (x == 1) {
            obtenerAreaCuadrado();
        } else {
            if (x == 2) {
                obtenerAreaTriangulo();
            } else {
                if (x == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("Dato no valido");
                }

            }
        }

    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double l1;
        System.out.println("Escribir L1");
        l1 = entrada.nextDouble();
        l1 = l1 * 4;
        System.out.print("El area del cuadrado es:"+l1);
    }

    public static void obtenerAreaTriangulo() {

    }

    public static void obtenerAreaRectangulo() {

    }

}
