package com.solid.domain;

import lombok.Data;
@Data
public class Funcionario extends Usuario{

    private String funcao;
    private Double salario;

    public Funcionario(Long id, String nome, String funcao, Double salairo) {
        super(id, nome, TipoPessoa.PESSOA_FISICA);
        this.funcao = funcao;
        this.salario = salairo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + super.getNome() + "', " +
                "funcao='" + funcao + '\'' +
                ", salario=" + salario +
                "} ";
    }
}
