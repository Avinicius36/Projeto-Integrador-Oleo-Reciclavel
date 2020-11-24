package Model;

public class Categoria {

    private String Descricao;

    private String Regra;

    public Categoria(String descricao, String regra) {
        Descricao = descricao;
        Regra = regra;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getRegra() {
        return Regra;
    }

    public void setRegra(String regra) {
        Regra = regra;
    }
}
