/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp04;

/**
 *
 * @author 8260528
 */
public class Exercicio5 {
    public static void main(String[] args) {
        double valor = Double.parseDouble(args[0]);
        double taxa = Double.parseDouble(args[1]);

        double resultado = valor * taxa;

        System.out.printf("%.2f%n", resultado);
    }
}

  
