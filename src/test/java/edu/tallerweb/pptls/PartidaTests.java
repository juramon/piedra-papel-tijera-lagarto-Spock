package edu.tallerweb.pptls;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartidaTests {

	@Test
	public void queTijeraCortaPapel(){
	
		Mano mano = new Mano(Forma.TIJERA);
		Mano otra = new Mano(Forma.PAPEL);
		
		assertEquals("Tijera corta Papel",
				Resultado.GANA, mano.jugarCon(otra));
		
	}
	
	@Test
	public void quePapelcubrePiedra(){
	
		Mano mano = new Mano(Forma.PAPEL);
		Mano otra = new Mano(Forma.PIEDRA);
		
		assertEquals("Papel cubre piedra",
				Resultado.GANA, mano.jugarCon(otra));
		
		
	}
	
	@Test
	public void queLagartoAplastaPiedra(){
	
		Mano mano = new Mano(Forma.LAGARTO);
		Mano otra = new Mano(Forma.PIEDRA);
		
		assertEquals("Lagarto aplasta Piedra",
				Resultado.PIERDE, mano.jugarCon(otra));
		
		
	}
	
	@Test
	public void queLagartoEnvenenaSpock(){
	
		Mano mano = new Mano(Forma.LAGARTO);
		Mano otra = new Mano(Forma.SPOCK);
		
		assertEquals("Lagarto envenena Spock",
				Resultado.GANA, mano.jugarCon(otra));
		
		
	}
	
	@Test
	public void queTijeraDestrozaSpock(){
	
		Mano mano = new Mano(Forma.TIJERA);
		Mano otra = new Mano(Forma.SPOCK);
		
		assertEquals("Tijera destroza Spock",
				Resultado.PIERDE, mano.jugarCon(otra));
		
		
	}
	
	@Test
	public void queTijeraDecapitaLagarto(){
	
		Mano mano = new Mano(Forma.TIJERA);
		Mano otra = new Mano(Forma.LAGARTO);
		
		assertEquals("Tijera decapita Lagarto",
				Resultado.GANA, mano.jugarCon(otra));
		
		
	}
	
	@Test
	public void queLagartoComaPapel(){
	
		Mano mano = new Mano(Forma.LAGARTO);
		Mano otra = new Mano(Forma.PAPEL);
		
		assertEquals("Lagarto come Papel",
				Resultado.GANA, mano.jugarCon(otra));
		
		
	}
	
	@Test
	public void quePapelRefutaSpock(){
	
		Mano mano = new Mano(Forma.PAPEL);
		Mano otra = new Mano(Forma.SPOCK);
		
		assertEquals("Papel refuta Spock",
				Resultado.GANA, mano.jugarCon(otra));
		
		
	}
	
	@Test
	public void queSpockVaporizaPiedra() {

		Mano mano = new Mano(Forma.SPOCK);
		Mano otra = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA, mano.jugarCon(otra));

	}	
	
	@Test
	public void quePiedraAplastaTijera(){
	
		Mano mano = new Mano(Forma.PIEDRA);
		Mano otra = new Mano(Forma.TIJERA);
		
		assertEquals("Piedra aplasta Tijera",
				Resultado.GANA, mano.jugarCon(otra));
		
		
	}

}
