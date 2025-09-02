/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculosprimos_theades;

/**
 *
 * @author 10724263295
 */
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
//        //Objeto para leitura dos dados
//        Scanner leitor = new Scanner(System.in);
//
//        // Entrada do intervalo
//        System.out.print("Digite o valor inicial: ");
//        long inicio = leitor.nextInt();
//
//        System.out.print("Digite o valor final: ");
//        long fim = leitor.nextInt();

        long inicio = 1;  // Valor inicial do intervalo
        long fim = 50000;     // Valor final do intervalo

        System.out.println("Números primos intervalo " + inicio + " e " + fim + ":");

        CalculosPrimos cp = new CalculosPrimos();

        cp.exibirPrimos(inicio, fim);
    }
}