/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromesgran;

import java.util.Scanner;

/**
 *
 * @author infot
 */
public class Numeromesgran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        int num1, num2;
        int gran = 0;

        System.out.println("Dame el primer numero");
        num1 = scan.nextInt();

        System.out.println("Dame el segundo numero");

        num2 = scan.nextInt();

        if (num1 == num2) {
            System.out.println("Los numeros han de ser diferentes");
        } else {
            if (num2 < num1) {
                gran = num1;
            } else {
                gran = num2;
            }
            System.out.println("El numero mes gran es: " + gran);

        }

    }

}
