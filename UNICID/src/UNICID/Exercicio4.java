package UNICID;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Exercicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;
	private JTextField txtPrecoFinal;
	private final ButtonGroup btgPagto = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEntreComO = new JLabel("Entre com o valor da venda: ");
		lblEntreComO.setBounds(37, 22, 185, 14);
		contentPane.add(lblEntreComO);
		
		txtValor = new JTextField();
		txtValor.setBounds(232, 19, 179, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JRadioButton rdDinheiro = new JRadioButton("Dinheiro");
		btgPagto.add(rdDinheiro);
		rdDinheiro.setBounds(28, 75, 109, 23);
		contentPane.add(rdDinheiro);
		
		JRadioButton rdCartao = new JRadioButton("Cart\u00E3o");
		btgPagto.add(rdCartao);
		rdCartao.setBounds(165, 75, 109, 23);
		contentPane.add(rdCartao);
		
		JRadioButton rdCheque = new JRadioButton("Cheque");
		btgPagto.add(rdCheque);
		rdCheque.setBounds(295, 75, 109, 23);
		contentPane.add(rdCheque);
		
		JLabel lblPreoFinalDa = new JLabel("Pre\u00E7o final da compra:");
		lblPreoFinalDa.setBounds(37, 128, 134, 14);
		contentPane.add(lblPreoFinalDa);
		
		txtPrecoFinal = new JTextField();
		txtPrecoFinal.setColumns(10);
		txtPrecoFinal.setBounds(232, 125, 179, 20);
		contentPane.add(txtPrecoFinal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = Double.parseDouble(txtValor.getText());
				double resultado;
				if(rdDinheiro.isSelected()) {
					double venda = Double.parseDouble(txtValor.getText());
					double desconto = venda*0.05;
					resultado = venda - desconto;
				} else if(rdCheque.isSelected()) {
					double venda = Double.parseDouble(txtValor.getText());
					double desconto = venda*0.05;
					resultado = venda + desconto;
				} else {
					double venda = Double.parseDouble(txtValor.getText());
					double desconto = venda*0.1;
					resultado = venda + desconto;
				}
				
				txtPrecoFinal.setText(String.valueOf(resultado));
				}
			});
		btnCalcular.setBounds(37, 171, 179, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValor.setText(null);
				btgPagto.clearSelection();
				txtPrecoFinal.setText(null);
			}
		});
		btnLimpar.setBounds(232, 171, 172, 23);
		contentPane.add(btnLimpar);
	}
}
