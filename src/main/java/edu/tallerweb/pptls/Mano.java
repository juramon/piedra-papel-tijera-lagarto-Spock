package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	private Forma forma;
	private final Resultado[][] matrizResultados = new Resultado[5][5];	
	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.forma = forma;
		cargarMatrizResultados();
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	
	public Resultado jugarCon(final Mano otra) {
		return this.matrizResultados[ this.forma.getValor()][otra.forma.getValor()];
	}
	
private void cargarMatrizResultados() {
		this.matrizResultados[Forma.TIJERA.getValor()][Forma.TIJERA.getValor()] = Resultado.EMPATA;
		this.matrizResultados[Forma.TIJERA.getValor()][Forma.PAPEL.getValor()] = Resultado.GANA;
		this.matrizResultados[Forma.TIJERA.getValor()][Forma.PIEDRA.getValor()] = Resultado.PIERDE;
		this.matrizResultados[Forma.TIJERA.getValor()][Forma.SPOCK.getValor()] = Resultado.PIERDE;
		this.matrizResultados[Forma.TIJERA.getValor()][Forma.LAGARTO.getValor()] = Resultado.GANA;
		this.matrizResultados[Forma.PAPEL.getValor()][Forma.TIJERA.getValor()] = Resultado.PIERDE;
		this.matrizResultados[Forma.PAPEL.getValor()][Forma.PAPEL.getValor()] = Resultado.EMPATA;
		this.matrizResultados[Forma.PAPEL.getValor()][Forma.PIEDRA.getValor()] = Resultado.GANA;
		this.matrizResultados[Forma.PAPEL.getValor()][Forma.SPOCK.getValor()] = Resultado.GANA;
		this.matrizResultados[Forma.PAPEL.getValor()][Forma.LAGARTO.getValor()] = Resultado.PIERDE;
		this.matrizResultados[Forma.PIEDRA.getValor()][Forma.TIJERA.getValor()] = Resultado.GANA;
		this.matrizResultados[Forma.PIEDRA.getValor()][Forma.PAPEL.getValor()] = Resultado.PIERDE;
		this.matrizResultados[Forma.PIEDRA.getValor()][Forma.PIEDRA.getValor()] = Resultado.EMPATA;
		this.matrizResultados[Forma.PIEDRA.getValor()][Forma.SPOCK.getValor()] = Resultado.PIERDE;
		this.matrizResultados[Forma.PIEDRA.getValor()][Forma.LAGARTO.getValor()] = Resultado.GANA;
		this.matrizResultados[Forma.SPOCK.getValor()][Forma.TIJERA.getValor()] = Resultado.GANA;
		this.matrizResultados[Forma.SPOCK.getValor()][Forma.PAPEL.getValor()] = Resultado.PIERDE;
		this.matrizResultados[Forma.SPOCK.getValor()][Forma.PIEDRA.getValor()] = Resultado.GANA;
		this.matrizResultados[Forma.SPOCK.getValor()][Forma.SPOCK.getValor()] = Resultado.EMPATA;
		this.matrizResultados[Forma.SPOCK.getValor()][Forma.LAGARTO.getValor()] = Resultado.PIERDE;
		this.matrizResultados[Forma.LAGARTO.getValor()][Forma.TIJERA.getValor()] = Resultado.PIERDE;
		this.matrizResultados[Forma.LAGARTO.getValor()][Forma.PAPEL.getValor()] = Resultado.GANA;
		this.matrizResultados[Forma.LAGARTO.getValor()][Forma.PIEDRA.getValor()] = Resultado.PIERDE;
		this.matrizResultados[Forma.LAGARTO.getValor()][Forma.SPOCK.getValor()] = Resultado.GANA;
		this.matrizResultados[Forma.LAGARTO.getValor()][Forma.LAGARTO.getValor()] = Resultado.EMPATA;
	}

}
