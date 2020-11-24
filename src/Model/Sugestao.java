package Model;

import java.time.LocalDateTime;

public class Sugestao {
    private Integer id;

    private String descricao;

    private LocalDateTime data;

    public Sugestao(Integer id, String descricao, LocalDateTime data) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
