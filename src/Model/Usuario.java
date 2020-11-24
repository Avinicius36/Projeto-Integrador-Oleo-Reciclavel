package Model;

import java.util.List;

public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private List<Sugestao> sugestoes;
    private Long telefone;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Sugestao> getSugestoes() {
        return sugestoes;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setSugestoes(List<Sugestao> sugestoes) {
        this.sugestoes = sugestoes;
    }

    public Usuario(String nome, String email, String senha, List<Sugestao> sugestoes, Long telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.sugestoes = sugestoes;
        this.telefone = telefone;

    }

}
