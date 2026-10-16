/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp04;

/**
 *
 * @author 8260528
 */

public class Exercicio2 {
    public static void main(String[] args) {
        int[] numeros = {2, 6, 7, 12, 28, 9, 13};

        System.out.println("Numeros primos:");

        for (int n : numeros) {
            boolean primo = n > 1;

            for (int i = 2; i <= n / i; i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(n);
            }
        }

        System.out.println("Numeros perfeitos:");

        for (int n : numeros) {
            int soma = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    soma += i;
                }
            }

            if (n > 1 && soma == n) {
                System.out.println(n);
            }
        }
    }
}

