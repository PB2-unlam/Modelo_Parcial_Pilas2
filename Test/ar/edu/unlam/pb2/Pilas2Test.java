package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.io.Console;

import org.junit.Assert;
import org.junit.Test;

public class Pilas2Test {

	@Test
	public void TestQueMidaLaCarga() {
		Pilas2 midaCargaTest = new Pilas2(1, 1);
		midaCargaTest.cargar(10);
		Integer actual = midaCargaTest.medirCarga();
		Integer expected = 10;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testQueCargueYConsuma() {
		Pilas2 cargaYConsume = new Pilas2(10, 1);
		cargaYConsume.cargar(10);
		cargaYConsume.consumir(10);
		cargaYConsume.consumir(80);
		cargaYConsume.cargar(1);
		Integer actual = cargaYConsume.medirCarga();
		Integer expected = 20;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testQueDevuelveConsumoTotal() {
		Pilas2 consumoTotalTest = new Pilas2(1, 1);
		consumoTotalTest.cargar(100);
		consumoTotalTest.consumir(50);
		consumoTotalTest.consumir(30);
		Integer actual = consumoTotalTest.consumoTotal();
		Integer expected = 80;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testQueDevuelvaCantidadDeCargas() {
		Pilas2 testQueDevuelveCargas = new Pilas2(10, 1);
		testQueDevuelveCargas.cargar(10);
		testQueDevuelveCargas.consumir(20);
		testQueDevuelveCargas.cargar(1);
		testQueDevuelveCargas.cargar(1);
		Integer actual = testQueDevuelveCargas.cargasTotales();
		Integer expected = 2;
		Assert.assertEquals(expected, actual);
	}

}
