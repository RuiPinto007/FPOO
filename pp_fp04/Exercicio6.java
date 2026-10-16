/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp04;

/**
 *
 * @author 8260528
 */
public class Exercicio6 {
    public static void main(String[] args) {
        int centimos = Integer.parseInt(args[0]);

        int euros = centimos / 100;
        int resto = centimos % 100;

        System.out.println(euros + " euros e "
                + resto + " centimos");
    }
}
    
