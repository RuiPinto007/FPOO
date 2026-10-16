/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp02;

/**
 *
 * @author 8260528
 */
import java.util.Scanner;
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduza o raio: ");
        double r = scanner.nextDouble();

        System.out.print("Introduza a altura: ");
        double a = scanner.nextDouble();

        double volume = Math.PI * r * r * a;

        System.out.println("Volume da lata: " + volume);

        scanner.close();
    }
}
    

