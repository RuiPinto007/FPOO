/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp04;

/**
 *
 * @author 8260528
 */

public class Exercicio1 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };

        int N = A.length;
        int[][] B = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = A[j][i];
            }
        }

        System.out.println("Matriz transposta:");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }
}
