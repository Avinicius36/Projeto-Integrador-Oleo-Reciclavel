package Model;

import java.time.LocalDateTime;

public class Endereco {

    private Receptor receptor;

    private LocalDateTime inicio_validade_endereco;

    private LocalDateTime fim_validade_endereco;

    private String logradouro;

    private Integer numero;

    private String complemento;

    private String bairro;

    private String cidade;

    private String estado;

    private LocalDateTime horario_abertura;

    private LocalDateTime horario_fechamento;

    public Endereco(Receptor receptor, LocalDateTime inicio_validade_endereco, LocalDateTime fim_validade_endereco, String logradouro, Integer numero, String complemento, String bairro, String cidade, String estado, LocalDateTime horario_abertura, LocalDateTime horario_fechamento) {
        this.receptor = receptor;
        this.inicio_validade_endereco = inicio_validade_endereco;
        this.fim_validade_endereco = fim_validade_endereco;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.horario_abertura = horario_abertura;
        this.horario_fechamento = horario_fechamento;
    }

    public Receptor getReceptor() {
        return receptor;
    }

    public void setReceptor(Receptor receptor) {
        this.receptor = receptor;
    }

    public LocalDateTime getInicio_validade_endereco() {
        return inicio_validade_endereco;
    }

    public void setInicio_validade_endereco(LocalDateTime inicio_validade_endereco) {
        this.inicio_validade_endereco = inicio_validade_endereco;
    }

    public LocalDateTime getFim_validade_endereco() {
        return fim_validade_endereco;
    }

    public void setFim_validade_endereco(LocalDateTime fim_validade_endereco) {
        this.fim_validade_endereco = fim_validade_endereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getHorario_abertura() {
        return horario_abertura;
    }

    public void setHorario_abertura(LocalDateTime horario_abertura) {
        this.horario_abertura = horario_abertura;
    }

    public LocalDateTime getHorario_fechamento() {
        return horario_fechamento;
    }

    public void setHorario_fechamento(LocalDateTime horario_fechamento) {
        this.horario_fechamento = horario_fechamento;
    }
}
