package com.example.meusgastos.domain.dto.centrodecusto;

public class CentroDeCustoResponseDTO {
    private Long id;
    private String descricao;
    private String observacao;
    
    public void setId(Long id) {
        this.id = id;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public Long getId() {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getObservacao() {
        return observacao;
    }
}
