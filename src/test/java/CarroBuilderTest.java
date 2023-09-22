import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroBuilderTest {

    @Test
    void deveRetornarExcecaoParaCarroSemMarca() {
        try {
           CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setNome("911 Carrera")
                    .setModelo("Sedan")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Marca inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCarroSemNome() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setModelo("Sedan")
                    .setMarca("Porsche")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarCarroValido() {
        CarroBuilder carroBuilder = new CarroBuilder();
        Carro carro = carroBuilder
                .setMarca("Porsche")
                .setNome("Cayman Gt4")
                .setCorCarro("Prata")
                .build();

        assertNotNull(carro);
    }
}