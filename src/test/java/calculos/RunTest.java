package calculos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import calculadora.Operacoes;

public class RunTest {
	
	Operacoes oper = new Operacoes();
	
	String operacao = null;
	double a = 0.0;
	double b = 0.0;
	boolean hasValue = false;
	
	@BeforeClass
	public static void headerClass() {
		print("CALCULADORA");
	}
	
	@Before
	public void headerTest() {
		 a = 10.0;
		 b = 4.0;
	}
	
	@Test
	public void testAssertEquals() {
		final double resultado = oper.somar(a, b);
		Assert.assertEquals(14.0, resultado, 0);
	}
	
	@Test
	public void testAssertTrue() {
		final double resultado = oper.multiplicar(a, b);
		
		if(resultado == 40.0) {
			hasValue = true;
		}
			Assert.assertTrue(hasValue);
	}
	
	@Test
	public void testAssertFalse() {
		final double resultado = oper.dividir(a, b);
		
		if(resultado == 10.0) {
			hasValue = true;
		} else {
			hasValue = false;
		}
		    Assert.assertFalse(hasValue);
	}
	
	@Test
	public void testAssertNotNull() {
		final double resultado = oper.somar(a, b);
		Assert.assertNotNull(resultado);
	}
	
	@Test
	public void testAssertNull() {
		final double resultado = oper.multiplicar(a, b);
		
		if(!(resultado == 20.0)) {
			operacao = null;
		}
			Assert.assertNull(operacao);
	}
	
	@Test(timeout = 300)
	public void testTimeout() throws InterruptedException {
		final double resultado = oper.subtrair(a, b);
		Thread.sleep(200);
		Assert.assertEquals(6.0, resultado, 0);
	}
	
	@Ignore
	@Test
	public void testIgnore() throws InterruptedException {
		print("Teste ignorado.");
	}
	
	@Test(expected = AssertionError.class)
	public void testException() {
		final String valor = "Calculadora";
		operacao = null;
		Assert.assertEquals(operacao, valor);
	}
	
	@After
	public void rodapeTest() {
		print("EFETUADO TESTE");
	}
	
	@AfterClass
	public static void rodapeClass() {
		print("ESSA CALCULADORA É DOS DEUSES");
	}
	
	/**
	 * Método responsável por printar mensagem no console.
	 * @param message
	 */
	public static void print(String message) {
		System.out.println(message);
	}
	
}
