package mvc;

import mvc.controller.CalculadoraController;
import mvc.model.CalculadoraModel;
import mvc.view.CalculadoraView;

public class Principal {

	public static void main(String[] args) {

		// objetos das classes MVC
		CalculadoraView view = new CalculadoraView();
		CalculadoraModel model = new CalculadoraModel();
		CalculadoraController controller = new CalculadoraController(view, model);

		// exibir formulário
		view.setVisible(true);
	}
}
