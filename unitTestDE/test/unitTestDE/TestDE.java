/**
 * 
 */
package unitTestDE;

import static org.junit.Assert.*;

import org.junit.Test;

import metier.De;

/**
 * @author ajc
 *
 */
public class TestDE {

	
	@Test
	public void testCtorr() {
		De d=new De();
		assertNotNull(d);
		
	}
	@Test
	public void testLancer() {
		De d=new De();
		int resultat = (int) d.lancer();
		assertTrue(resultat >0 && resultat <7);
		
	}

}
