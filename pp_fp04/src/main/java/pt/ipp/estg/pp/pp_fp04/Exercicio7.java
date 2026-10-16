/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp04;

/**
 *
 * @author 8260528
 */
public class Exercicio7 {
    public static void main(String[] args) {
        int dividendo = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);

        if (divisor == 0) {
            System.out.println("Nao e possivel dividir por zero");
            return;
        }

        int quociente = 0;
        int resto = dividendo;

        while (resto >= divisor) {
            resto = resto - divisor;
            quociente++;
        }

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}