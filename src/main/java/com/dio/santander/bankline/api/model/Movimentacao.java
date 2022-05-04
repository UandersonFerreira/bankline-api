package com.dio.santander.bankline.api.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tab_movimentacao")
public class Movimentacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "data_hora")
    private LocalDateTime dataHora;
    private String descricao;
    //quando o nome da coluna no banco e igual ao atributo não a necessidade de definir um nome para a coluna com o @Column, pois o JPA irá entender
    private Double valor;
    @Enumerated(EnumType.STRING)//salvo o proprio valor literal/real(Receita ou Despesa)
    private MovimentacaoTipo tipoMovimentacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public MovimentacaoTipo getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(MovimentacaoTipo tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }
}//class
