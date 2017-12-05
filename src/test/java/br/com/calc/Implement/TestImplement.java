package br.com.calc.Implement;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.calc.AbstractTest;
import br.com.calc.controller.CalcController;


public class TestImplement extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(TestImplement.class);
	
	@Test
	public void somaTest() {
		Double soma;
		CalcController calcular = new CalcController();
		soma = calcular.soma(3.0, 2.0);
		LOGGER.info("Soma = " + soma);
	}

	@Test
	public void subtraiTest() {
		Double subtrai;
		CalcController calcular = new CalcController();
		subtrai = calcular.subtrai(3.0, 2.0);
		LOGGER.info("Subtrai = " + subtrai);
	}

	@Test
	public void multiplicarTest() {
		Double multiplicar;
		CalcController calcular = new CalcController();
		multiplicar = calcular.multiplica(3.0, 2.0);
		LOGGER.info("Multiplicar = " + multiplicar);
	}

	@Test
	public void dividirTest() {
		Double dividir;
		CalcController calcular = new CalcController();
		dividir = calcular.divide(3.0, 2.0);
		LOGGER.info("Dividir = " + dividir);
		
	}

}
