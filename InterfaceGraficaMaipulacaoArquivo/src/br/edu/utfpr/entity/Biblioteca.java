/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.entity;

/**
 *
 * @author root
 */
public class Biblioteca {
    
    private String nome;
    private int quantidadeLivros;
    private int quantidadePrateleiras;

    public Biblioteca() {
    }

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeLivros() {
        return quantidadeLivros;
    }

    public void setQuantidadeLivros(int quantidadeLivros) {
        this.quantidadeLivros = quantidadeLivros;
    }

    public int getQuantidadePrateleiras() {
        return quantidadePrateleiras;
    }

    public void setQuantidadePrateleiras(int quantidadePrateleiras) {
        this.quantidadePrateleiras = quantidadePrateleiras;
    }
    
    
    
}
