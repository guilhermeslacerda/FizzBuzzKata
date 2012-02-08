package fbk;

import java.util.*;

public class FizzBuzz {
	public static List<String> gera(final int numero) {
		List<String> sequencia = new ArrayList<String>();

		for ( Integer indx = 1; indx <= numero; indx++ ) {
			if ( seMultiplo3e5( indx ) )
				sequencia.add("FizzBuzz");
			else if ( seMultiplo3( indx ) )
				sequencia.add( "Fizz" );
			else if ( seMultiplo5( indx ) )
				sequencia.add( "Buzz" );
			else sequencia.add( indx.toString() );
		}
		
		return sequencia;
	}
	
	private static boolean seMultiplo3e5( final int numero ) {
		return (seMultiplo3(numero) && seMultiplo5(numero));
	}
	
	private static boolean seMultiplo3( final int numero ) {
		return (numero % 3 == 0);
	}

	private static boolean seMultiplo5( final int numero ) {
		return (numero % 5 == 0);
	}
}
