package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.Vendedor;
import me.dio.models.operadorCaixa;

public class Main {
    public static void main(String[] args) {
        /*Endereco endereco = new Endereco();
        endereco.setRua("Endereco dessa rua");
        System.out.println(endereco.getRua());*/

        Endereco endereco = new Endereco("Rua funcionario",
                "complemento endereco funcinario", "bairro funcionario");
        System.out.println("-------");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Camila Vendedora");
        vendedor.setDocumento("12345678900");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);

        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("-------");

        operadorCaixa operadorCaixa = new operadorCaixa("Camila Op Caixa", "789.456.123-00", 2000d, endereco);
        System.out.println(operadorCaixa);

        Gerente gerente = new Gerente();
        gerente.setNome("Camila gerente");
        gerente.setDocumento("456.123.789-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);
        System.out.println(gerente);





    }
}
