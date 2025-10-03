package com.mycompany.sistemaestoque;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gisel
 */
public class Produto {
    private String nome;
    private float preco;
    private int quantidade;
    private String codigo;
    
    public Produto(String nome, float preco, int quantidade, String codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    public float getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public String getCodigo() {
        return codigo;
    }
    
    public void exibir() {
        System.out.println("--- DETALHES DO PRODUTO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Em estoque: " + quantidade + " unidades");
        System.out.println("Codigo: " + codigo);
        System.out.println("---------------------------");
    }
}
