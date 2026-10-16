/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp04;

/**
 *
 * @author 8260528
 */
public class Exercicio8 {
    public static void main(String[] args) {
        double valor = Double.parseDouble(args[0]);
        int centimos = (int) Math.round(valor * 100);

        int[] moedas = {200, 100, 50, 20, 10, 5, 2, 1};

        for (int moeda : moedas) {
            int quantidade = centimos / moeda;
            centimos = centimos % moeda;

            if (quantidade > 0) {
                if (moeda >= 100) {
                    int euros = moeda / 100;

                    System.out.println(quantidade
                            + (quantidade == 1
                            ? " moeda de " : " moedas de ")
                            + euros + (euros == 1
                            ? " euro" : " euros"));
                } else {
                    System.out.println(quantidade
                            + (quantidade == 1
                            ? " moeda de " : " moedas de ")
                            + moeda + " centimos");
                }
            }
        }
    }
}


