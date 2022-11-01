package test.java.factorymethod;

import main.java.factorymethod.*;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.fail;
import static org.junit.jupiter.api.Assertions.*;

public class UberFactoryTest {
    @Test
    public void deveRetornarExcecaoParaUberInexistente() {
        try {
            IUber uber = UberFactory.obterUber("White");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de Uber inexistente", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaUberInvalido() {
        try {
            IUber servico = UberFactory.obterUber("Barco");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }

    @Test
    public void deveExecutarUberCarro() {
        IUber uber = UberFactory.obterUber("Carro");
        assertEquals("Chamando Uber Carro", uber.chamarUber());
    }

    @Test
    public void deveExecutarUberMoto() {
        IUber uber = UberFactory.obterUber("Moto");
        assertEquals("Chamando Uber Moto", uber.chamarUber());
    }

    @Test
    public void deveExecutarUberBlack() {
        IUber uber = UberFactory.obterUber("Black");
        assertEquals("Chamando Uber Black", uber.chamarUber());
    }

    @Test
    public void deveCancelarUberCarro() {
        IUber uber = UberFactory.obterUber("Carro");
        assertEquals("Cancelando Uber Carro", uber.cancelarUber());
    }

    @Test
    public void deveCancelarUberMoto() {
        IUber uber = UberFactory.obterUber("Moto");
        assertEquals("Cancelando Uber Moto", uber.cancelarUber());
    }

    @Test
    public void deveCancelarUberBlack() {
        IUber uber = UberFactory.obterUber("Black");
        assertEquals("Cancelando Uber Black", uber.cancelarUber());
    }
}
