package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.CalculadoraModel;
import mvc.view.CalculadoraView;

public class CalculadoraController {

	// objetos da classes view e model
	private CalculadoraView view;
	private CalculadoraModel model;

	// construtor
	public CalculadoraController(CalculadoraView view, CalculadoraModel model) {
		super();
		this.view = view;
		this.model = model;
		// implementar um ouvinte para o botão da view
		this.view.CalculadoraListener(new CalculadoraListener());
	}

	// classe ouvinte (Listener), quando o botão for clicado
	class CalculadoraListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// variáveis locais
			int numero1, numero2 = 0;
			// tentativa
			try {
				numero1 = view.getNumero1();
				numero2 = view.getNumero2();
				model.somar(numero1, numero2);
				view.setResultado(model.retornarResultado());
			} catch (NumberFormatException ex) {
				view.displayErrorMessage("letras não são permitidas");
			}
		}
	}
}
