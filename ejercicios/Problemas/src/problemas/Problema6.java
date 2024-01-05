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
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media;
        double desviacionEstandar;
        media = obtenerMediaAritmetica(informacion);
        desviacionEstandar = obtenerDesviacionEstandar(informacion, media);
        System.out.printf("Media aritmetica: %.2f\nDesviacion estandar: %.2f\n",
                 media, desviacionEstandar);
    }

    public static double obtenerMediaAritmetica(int[] informacion) {
        double media = 0;
        double suma = 0;
        for (int i = 0; i < informacion.length; i++) {
            suma = suma + informacion[i];
        }
        media = suma / informacion.length;
        return media;
    }

    public static double obtenerDesviacionEstandar(int[] informacion, double media) {
        double diferencia = 0;
        double suma = 0;
        double d = 0;
        double desviacionEstandar = 0;
        for (int i = 0; i < informacion.length; i++) {
            diferencia = Math.pow(informacion[i] - media, 2);
            suma = diferencia + suma;
        }
        d = suma / informacion.length;
        desviacionEstandar = Math.sqrt(d);
        return desviacionEstandar;
    }
}
