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
        System.out.printf("El area del cuadrado es:%.2f\n",l1);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese base");
        base = entrada.nextDouble();
        System.out.println("Ingrese altura");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("El area del triangulo es:%.2f\n",area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese base");
        base = entrada.nextDouble();
        System.out.println("Ingrese altura");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.printf("El area del rectangulo es:%.2f\n",area);
    }

}
