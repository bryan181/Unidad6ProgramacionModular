package src;

import java.util.Scanner;

public class Ejercicio3 {
    public int[] enteros = new int [8];
    public Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Ejercicio3 ejecutar = new Ejercicio3();
    }
    public Ejercicio3 () {
        for (int i = 0; i < enteros.length; i++) {
            llenar(i);
        }
        System.out.println("¿Que valor desea buscar?");
        System.out.println(existe(entrada.nextInt()));
    }
 
    public void llenar(int indice) {
        System.out.println("Ingrese el valor para el espacio )"+indice);
        enteros[indice] = entrada.nextInt();
    }
    public boolean existe (int buscar){
        boolean existe = false;
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] == buscar) {
                existe = true;
            } else {
                existe = false;
            }
        }
        return existe;
    }
}