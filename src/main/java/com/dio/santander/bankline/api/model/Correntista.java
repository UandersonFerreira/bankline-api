package com.dio.santander.bankline.api.model;

import javax.persistence.*;

@Entity//define a classe como uma entidade
@Table(name = "tab_corresntista")
public class Correntista {
   @Id//informa quem será a key primary da entidade/tabela
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   //indica que será criado um id automaticamente é que serão unicos.
   private Integer id;
   @Column(length = 20)//define o tamanho da coluna
   private String cpf;
    @Column(length = 60)//define o tamanho da coluna
    private String nome;
   @Embedded
    private Conta conta;
   /*
    @Embedded -> as informações que estiverem nesta classe estarão na mesma
   //tabela que a tabela principal, a tabela que possui uma referência a esta classe
   (Uma forma de relação entre classes entre aspas)

    */


    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}//class
