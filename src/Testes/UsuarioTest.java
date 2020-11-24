package Testes;

import Model.Sugestao;
import Model.Usuario;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void getNome() {
        List<Sugestao> sugestoes = new ArrayList<>();
        Sugestao sugestao1 = new Sugestao(1, "Sugestao1", LocalDateTime.now());
        Sugestao sugestao2 = new Sugestao(2, "Sugestao2", LocalDateTime.now());
        Sugestao sugestao3 = new Sugestao(3, "Sugestao3", LocalDateTime.now());
        sugestoes.add(sugestao1);
        sugestoes.add(sugestao2);
        sugestoes.add(sugestao3);

        Usuario usuario1 = new Usuario("Claudio", "claudio@gmail.com", "151019587", sugestoes, 50644521641L);
        assertEquals("Claudio", usuario1.getNome());
    }

    @Test
    void getEmail() {
        List<Sugestao> sugestoes = new ArrayList<>();
        Sugestao sugestao1 = new Sugestao(1, "Sugestao1", LocalDateTime.now());
        Sugestao sugestao2 = new Sugestao(2, "Sugestao2", LocalDateTime.now());
        Sugestao sugestao3 = new Sugestao(3, "Sugestao3", LocalDateTime.now());
        sugestoes.add(sugestao1);
        sugestoes.add(sugestao2);
        sugestoes.add(sugestao3);

        Usuario usuario1 = new Usuario("Claudio", "claudio@gmail.com", "151019587", sugestoes, 50644521641L);
        assertEquals("claudio@gmail.com", usuario1.getEmail());
    }


    @Test
    void getSenha() {
        List<Sugestao> sugestoes = new ArrayList<>();
        Sugestao sugestao1 = new Sugestao(1, "Sugestao1", LocalDateTime.now());
        Sugestao sugestao2 = new Sugestao(2, "Sugestao2", LocalDateTime.now());
        Sugestao sugestao3 = new Sugestao(3, "Sugestao3", LocalDateTime.now());
        sugestoes.add(sugestao1);
        sugestoes.add(sugestao2);
        sugestoes.add(sugestao3);

        Usuario usuario1 = new Usuario("Claudio", "claudio@gmail.com", "151019587", sugestoes, 50644521641L);
        assertEquals("151019587", usuario1.getSenha());

    }

    @Test
    void getSugestoes() {
        List<Sugestao> sugestoes = new ArrayList<>();
        Sugestao sugestao1 = new Sugestao(1, "Sugestao1", LocalDateTime.now());
        Sugestao sugestao2 = new Sugestao(2, "Sugestao2", LocalDateTime.now());
        Sugestao sugestao3 = new Sugestao(3, "Sugestao3", LocalDateTime.now());
        sugestoes.add(sugestao1);
        sugestoes.add(sugestao2);
        sugestoes.add(sugestao3);

        Usuario usuario1 = new Usuario("Claudio", "claudio@gmail.com", "151019587", sugestoes, 50644521641L);
        assertEquals(sugestoes, usuario1.getSugestoes());
    }

    @Test
    void getTelefone() {
        List<Sugestao> sugestoes = new ArrayList<>();
        Sugestao sugestao1 = new Sugestao(1, "Sugestao1", LocalDateTime.now());
        Sugestao sugestao2 = new Sugestao(2, "Sugestao2", LocalDateTime.now());
        Sugestao sugestao3 = new Sugestao(3, "Sugestao3", LocalDateTime.now());
        sugestoes.add(sugestao1);
        sugestoes.add(sugestao2);
        sugestoes.add(sugestao3);

        Usuario usuario1 = new Usuario("Claudio", "claudio@gmail.com", "151019587", sugestoes, 50644521641L);
        assertEquals(50644521641L, usuario1.getTelefone());
    }
}