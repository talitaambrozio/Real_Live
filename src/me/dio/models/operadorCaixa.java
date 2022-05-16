package me.dio.models;

public class operadorCaixa extends FuncionarioCLT{

    public operadorCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    public operadorCaixa() {
    }

    @Override
    public String toString() {
        return "operadorCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                '}';
    }



}
