/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp02;

/**
 *
 * @author 8260528
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] temperaturas = {12, 5, -2, 10, 8, 22, 3, 18, 8, -1};

        int soma = 0;
        int menor = temperaturas[0];
        int maior = temperaturas[0];

        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];

            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }

            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }

        double media = (double) soma / temperaturas.length;

        System.out.println("Media: " + media);
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
    }  
}
