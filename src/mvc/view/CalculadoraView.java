package mvc.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraView extends JFrame {

	// componentes
	private JTextField numero1 = new JTextField(10);
	private JLabel rotuloSoma = new JLabel("+");
	private JTextField numero2 = new JTextField(10);
	private JButton botaoCalcular = new JButton("caucular");
	private JTextField resultado = new JTextField(20);

	// construtor
	public CalculadoraView() {
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		calcPanel.add(numero1);
		calcPanel.add(rotuloSoma);
		calcPanel.add(numero2);
		calcPanel.add(botaoCalcular);
		calcPanel.add(resultado);
		this.add(calcPanel);
	}

	// set e get
	public int getNumero1() {
		return Integer.parseInt(numero1.getText());
	}

	public int getNumero2() {
		return Integer.parseInt(numero2.getText());
	}

	public int getResultado() {
		return Integer.parseInt(resultado.getText());
	}

	public void setResultado(int solution) {
		resultado.setText(Integer.toString(solution));
	}

	// ActionListener, responsável pelo evento do botão
	public void CalculadoraListener(ActionListener eventoBotaoCalcular) {
		botaoCalcular.addActionListener(eventoBotaoCalcular);
	}

	// Erro ao calcular
	public void displayErrorMessage(String mensagemErro) {
		JOptionPane.showMessageDialog(this, mensagemErro);
	}
}
