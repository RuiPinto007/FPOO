/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp04;

/**
 *
 * @author 8260528
 */
public class Exercicio3 {
    public static void main(String[] args) {
        int[][] matriz = {
            {2, 5, 3},
            {4, 2, 8},
            {2, 7, 1},
            {6, 2, 9}
        };

        int numeroRepetido = matriz[0][0];
        int maiorFrequencia = 0;

        for (int i = 0; i < 4; i++) {
            int maior = matriz[i][0];
            int menor = matriz[i][0];

            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }

                int frequencia = 0;

                for (int x = 0; x < 4; x++) {
                    for (int y = 0; y < 3; y++) {
                        if (matriz[x][y] == matriz[i][j]) {
                            frequencia++;
                        }
                    }
                }

                if (frequencia > maiorFrequencia) {
                    maiorFrequencia = frequencia;
                    numeroRepetido = matriz[i][j];
                }
            }

            System.out.println("Linha " + (i + 1)
                    + ": maior = " + maior
                    + ", menor = " + menor);
        }

        System.out.println("Numero mais repetido: "
                + numeroRepetido);
        System.out.println("Frequencia: " + maiorFrequencia);
    }
}
