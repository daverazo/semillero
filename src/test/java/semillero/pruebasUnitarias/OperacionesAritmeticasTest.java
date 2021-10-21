package semillero.pruebasUnitarias;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import junit.framework.Assert;

/**
<b> Descripcion: <b> Clase que determina las pruebas unitarias para el  150  gestionar operaciones aritmeticas
 
*/


public class OperacionesAritmeticasTest {
	
	private final static Logger log=Logger.getLogger(OperacionesAritmeticasTest.class);
	
	@BeforeTest
	public void inicializar() {
		
		BasicConfigurator.configure(); //inicializa el logger con una configuracion basica
	}
	
	/**
	 * Metodo encargado de probar que el resultado de la suma de dos numeros*/
	@Test
	public void validarResultadoSumaExitoso()
	{
		log.info("inicia la ejecucion  del metodo validarResultadoSumaExitoso()");
		int numero1=150;
		int numero2=300;
		int resultado=450;
		
		//Assert.assertFalse(condition);
		//Assert.assertTrue(condition);
		//Assert.
		Assert.assertEquals(resultado, numero1+numero2);
		
		log.info("Finaliza la ejecucion del metodo validarResultadoSumaExitoso");
	}
	
	public void 
	
	

}
