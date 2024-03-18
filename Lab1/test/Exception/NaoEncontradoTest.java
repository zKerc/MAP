package Exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class NaoEncontradoTest {

    @Test
    public void testMensagemConstrutor() {
        String mensagem = "Objeto não encontrado!";
        NaoEncontrado excecao = new NaoEncontrado(mensagem);
        assertEquals(mensagem, excecao.getMessage());
    }
}
