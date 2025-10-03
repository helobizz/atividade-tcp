/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaestoque;
import java.util.Scanner;
/**
 *
 * @author gisel
 */
public class SistemaEstoque {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Produto[] produtos = new Produto[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do produto " + (i+1) + ":");
            String nome = entrada.nextLine();
            
            System.out.println("Digite o preco do produto " + (i+1) + ":");
            float preco = entrada.nextFloat();
            entrada.nextLine();
            
            System.out.println("Digite a quantidade em estoque do produto: ");
            int quantidade = entrada.nextInt();
            entrada.nextLine();
            
            System.out.println("Digite o codigo do produto " + (i+1) + ":");
            String codigo = entrada.nextLine();
            
            produtos[i] = new Produto(nome, preco, quantidade, codigo);
            System.out.println();
        }
        
        for (Produto p : produtos) {
            p.exibir();
        }
        
        entrada.close();
    }
}
