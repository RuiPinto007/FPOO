/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp02;

/**
 *
 * @author 8260528
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};

        int produto = 1;
        int negativos = 0;
        int maior = lista[0];

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > 0) {
                produto *= lista[i];
            }

            if (lista[i] < 0) {
                negativos++;
            }

            if (lista[i] > maior) {
                maior = lista[i];
            }
        }

        System.out.println("Produto dos positivos: " + produto);
        System.out.println("Quantidade de negativos: " + negativos);
        System.out.println("Maior numero: " + maior);
    }
}

    

