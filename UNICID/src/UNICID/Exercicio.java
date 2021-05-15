package UNICID;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Exercicio extends JFrame {

	private JPanel txtVenda;
	private JTextField txtValorVenda;
	private JTextField txtPrecoFinal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio frame = new Exercicio();
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
	public Exercicio() {
		getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 18));
		getContentPane().setLayout(null);
		
		JLabel lblEntreComO = new JLabel("Entre com o valor da venda:");
		lblEntreComO.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEntreComO.setBounds(20, 21, 226, 14);
		getContentPane().add(lblEntreComO);
		
		JLabel lblEscolhaAForma = new JLabel("Escolha a forma de pagto:");
		lblEscolhaAForma.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEscolhaAForma.setBounds(20, 46, 226, 22);
		getContentPane().add(lblEscolhaAForma);
		
		JLabel lblPreoFinalA = new JLabel("Pre\u00E7o final a pagar");
		lblPreoFinalA.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPreoFinalA.setBounds(20, 71, 226, 22);
		getContentPane().add(lblPreoFinalA);
		
		txtValorVenda = new JTextField();
		txtValorVenda.setBounds(245, 20, 179, 20);
		getContentPane().add(txtValorVenda);
		txtValorVenda.setColumns(10);
		
		txtPrecoFinal = new JTextField();
		txtPrecoFinal.setColumns(10);
		txtPrecoFinal.setBounds(245, 74, 179, 20);
		getContentPane().add(txtPrecoFinal);
		
		JComboBox cmbPagto = new JComboBox();
		cmbPagto.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma op\u00E7\u00E3o", "Dinheiro", "Cheque", "Cart\u00E3o"}));
		cmbPagto.setBounds(245, 46, 179, 20);
		getContentPane().add(cmbPagto);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double resultado;
				if(cmbPagto.getSelectedIndex() == 1) {
					double venda = Double.parseDouble(txtValorVenda.getText());
					double desconto = venda*0.05;
					resultado = venda - desconto;
				} else if(cmbPagto.getSelectedIndex() == 2) {
					double venda = Double.parseDouble(txtValorVenda.getText());
					double desconto = venda*0.05;
					resultado = venda + desconto;
				} else {
					double venda = Double.parseDouble(txtValorVenda.getText());
					double desconto = venda*0.1;
					resultado = venda + desconto;
				}
				
				txtPrecoFinal.setText(String.valueOf(resultado));
			}
		});
		btnCalcular.setBounds(10, 138, 206, 23);
		getContentPane().add(btnCalcular);
		
		JButton btnCalcular_1 = new JButton("Limpar");
		btnCalcular_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtValorVenda.setText(null);
				cmbPagto.setSelectedIndex(0);
				txtPrecoFinal.setText(null);
			}
		});
		btnCalcular_1.setBounds(218, 138, 206, 23);
		getContentPane().add(btnCalcular_1);
		
		
	}
}
