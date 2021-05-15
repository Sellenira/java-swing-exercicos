package UNICID;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercico3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtQSorvete;
	private JTextField txtQChocolate;
	private JTextField txtQBola;
	private JTextField txtQPote;
	private JTextField txtPrecoSorvete;
	private JTextField txtPrecoChocolate;
	private JTextField txtPrecoBola;
	private JTextField txtPrecoPote;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercico3 frame = new Exercico3();
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
	public Exercico3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipoDeSorvete = new JLabel("Tipo de Sorvete");
		lblTipoDeSorvete.setBounds(10, 11, 101, 14);
		contentPane.add(lblTipoDeSorvete);
		
		JLabel lblQtde = new JLabel("Qtde");
		lblQtde.setBounds(173, 11, 46, 14);
		contentPane.add(lblQtde);
		
		JLabel lblPreoUnitrio = new JLabel("Pre\u00E7o Unit\u00E1rio");
		lblPreoUnitrio.setBounds(300, 11, 106, 14);
		contentPane.add(lblPreoUnitrio);
		
		JLabel lblSorveteDeFrutas = new JLabel("Sorvete de Frutas");
		lblSorveteDeFrutas.setBounds(10, 36, 101, 14);
		contentPane.add(lblSorveteDeFrutas);
		
		JLabel lblChocolatefrutas = new JLabel("Chocolate/Frutas");
		lblChocolatefrutas.setBounds(10, 61, 101, 14);
		contentPane.add(lblChocolatefrutas);
		
		JLabel lblBola = new JLabel("Bola");
		lblBola.setBounds(10, 86, 46, 14);
		contentPane.add(lblBola);
		
		JLabel lblPoteDel = new JLabel("Pote de 2 Litros");
		lblPoteDel.setBounds(10, 111, 89, 14);
		contentPane.add(lblPoteDel);
		
		txtQSorvete = new JTextField();
		txtQSorvete.setBounds(143, 30, 86, 20);
		contentPane.add(txtQSorvete);
		txtQSorvete.setColumns(10);
		
		txtQChocolate = new JTextField();
		txtQChocolate.setColumns(10);
		txtQChocolate.setBounds(143, 58, 86, 20);
		contentPane.add(txtQChocolate);
		
		txtQBola = new JTextField();
		txtQBola.setColumns(10);
		txtQBola.setBounds(143, 83, 86, 20);
		contentPane.add(txtQBola);
		
		txtQPote = new JTextField();
		txtQPote.setColumns(10);
		txtQPote.setBounds(143, 108, 86, 20);
		contentPane.add(txtQPote);
		
		txtPrecoSorvete = new JTextField();
		txtPrecoSorvete.setColumns(10);
		txtPrecoSorvete.setBounds(300, 30, 86, 20);
		contentPane.add(txtPrecoSorvete);
		
		txtPrecoChocolate = new JTextField();
		txtPrecoChocolate.setColumns(10);
		txtPrecoChocolate.setBounds(300, 58, 86, 20);
		contentPane.add(txtPrecoChocolate);
		
		txtPrecoBola = new JTextField();
		txtPrecoBola.setColumns(10);
		txtPrecoBola.setBounds(300, 83, 86, 20);
		contentPane.add(txtPrecoBola);
		
		txtPrecoPote = new JTextField();
		txtPrecoPote.setColumns(10);
		txtPrecoPote.setBounds(300, 108, 86, 20);
		contentPane.add(txtPrecoPote);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(300, 139, 86, 20);
		contentPane.add(txtTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(143, 142, 46, 14);
		contentPane.add(lblTotal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int QSorvete = Integer.parseInt(txtQSorvete.getText());
				int QChocolate = Integer.parseInt(txtQSorvete.getText());
				int QBola = Integer.parseInt(txtQSorvete.getText());
				int QPote = Integer.parseInt(txtQSorvete.getText());
				
				double PrecoSorvete = Double.parseDouble(txtPrecoSorvete.getText());
				double PrecoChocolate = Double.parseDouble(txtPrecoSorvete.getText());
				double PrecoBola = Double.parseDouble(txtPrecoSorvete.getText());
				double PrecoPote = Double.parseDouble(txtPrecoSorvete.getText());
				
				double resultado = (QSorvete*PrecoSorvete) + (QChocolate*PrecoChocolate) + (QBola*PrecoBola) + (QPote*PrecoPote);
						
				txtTotal.setText(String.valueOf(resultado));
			}
		});
		btnCalcular.setBounds(140, 177, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtQSorvete.setText(null);
				txtQChocolate.setText(null);
				txtQBola.setText(null);
				txtQPote.setText(null);
				txtPrecoSorvete.setText(null);
				txtPrecoChocolate.setText(null);
				txtPrecoBola.setText(null);
				txtPrecoPote.setText(null);
				txtTotal.setText(null);

			}
		});
		btnLimpar.setBounds(300, 177, 89, 23);
		contentPane.add(btnLimpar);
	}

}
