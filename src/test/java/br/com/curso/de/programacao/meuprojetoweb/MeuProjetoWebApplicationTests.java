package br.com.curso.de.programacao.meuprojetoweb;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MeuProjetoWebApplicationTests {

	private BigDecimal meuSalarioDeProgramador = new BigDecimal("10.00");

	@Test
	void contextLoads() {
		System.out.println("Começando o Debug");
		System.out.println("O salario de programador é: " + meuSalarioDeProgramador);
		System.out.println("Fim do Debug");
	}

}
