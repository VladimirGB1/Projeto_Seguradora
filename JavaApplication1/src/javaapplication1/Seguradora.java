/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author alunodev08
 */
public class Veiculo {
    private int ano;
    private String marca;
    private String cor;
    private String placa;
    private Modelo modelo;

    public Veiculo(int ano, String marca, String cor, String placa) {
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }
    
      
}
