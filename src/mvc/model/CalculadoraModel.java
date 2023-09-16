package mvc.model;

public class CalculadoraModel {

	// responsável por obter o valor do cáuculo
	private int resultado;

	// realizar oáuculo da soma
	public void somar(int numero1, int numero2) {
		resultado = numero1 + numero2;
	}

	// exibir o cáuculo da soma
	public int retornarResultado() {
		return resultado;
	}
	
}