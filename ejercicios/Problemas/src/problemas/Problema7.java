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
public class Problema7 {

    static int numeroDatos;

    public static void main(String[] args) {
        String[] informacion = new String[numeroDatos];
        informacion = obtenerDatos();
        obtenerDatos2(informacion);
    }

    public static String[] obtenerDatos() {
        Scanner entrada = new Scanner(System.in);
        String datos = "";
        System.out.print("Ingrese el numero de datos a ingresar:");
        numeroDatos = entrada.nextInt();
        String[] informacion = new String[numeroDatos];
        entrada.nextLine();
        for (int i = 0; i < informacion.length; i++) {
            System.out.printf("Ingrese el dato#%d:", i + 1);
            datos = entrada.nextLine();
            informacion[i] = datos;
        }
        return informacion;
    }

    public static void obtenerDatos2(String[] informacion) {

        for (int i = 0; i < informacion.length; i++) {
            if (informacion[i].length() == 4 || informacion[i].length() == 5) {
                System.out.println(informacion[i]);
            }
        }
    }
}
