package Testes;

import Model.Categoria;
import Model.Receptor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceptorTest {

    @Test
    void getId() {
        Receptor receptor = new Receptor(1, 50644521641L);
        assertEquals(1, receptor.getId());
    }

    @Test
    void setId() {
    }

    @Test
    void getCpf() {
        Receptor receptor = new Receptor(1, 50644521641L);
        assertEquals(50644521641L, receptor.getCpf());
    }

    @Test
    void setCpf() {
        Receptor receptor = new Receptor(1, 50644521641L);
        assertEquals(50644521641L, receptor.getCpf());
    }
}