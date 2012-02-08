package fbk.tests;

import java.util.*;

import fbk.FizzBuzz;
import junit.framework.Assert;

import org.junit.Test;

public class FizzBuzzTest {

	private List<String> lista(String... sequencia) {
		List<String> lista = new ArrayList<String>();
		for ( int indx = 0; indx < sequencia.length; indx++ )
			lista.add(sequencia[indx]);
				
		return lista;
	}
	
	@Test public void verificaSeForUm() {
		Assert.assertEquals(lista("1"), FizzBuzz.gera(1));
	}

	@Test public void verificaSeForTres() {
		Assert.assertEquals(lista("1","2", "Fizz"), FizzBuzz.gera(3));
	}

	@Test public void verificaSeForCinco() {
		Assert.assertEquals(lista("1","2", "Fizz", "4", "Buzz"), FizzBuzz.gera(5));
	}

	@Test public void verificaSeForDez() {
		Assert.assertEquals(lista("1","2", "Fizz", "4", "Buzz", "Fizz", "7", 
									"8", "Fizz", "Buzz"), FizzBuzz.gera(10));
	}
	
	@Test public void verificaSeForQuinze() {
		Assert.assertEquals(lista("1","2", "Fizz", "4", "Buzz", "Fizz", "7", 
				"8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"), 
				FizzBuzz.gera(15));
	}

}
