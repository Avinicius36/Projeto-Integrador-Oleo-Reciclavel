package Testes;

import Model.Categoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoriaTest {

    @Test
    void getDescricao() {
        Categoria categoria = new Categoria("Média", "Regra123");
        assertEquals("Média", categoria.getDescricao());
    }


    @Test
    void setDescricao() {
        Categoria categoria = new Categoria("Média", "Regra123");
        assertEquals("Média", categoria.getDescricao());
    }

    @Test
    void getRegra() {
        Categoria categoria = new Categoria("Média", "Regra123");
        assertEquals("Regra123", categoria.getRegra());
    }

    @Test
    void setRegra() {
        Categoria categoria = new Categoria("Média", "Regra123");
        assertEquals("Regra123", categoria.getRegra());
    }

}