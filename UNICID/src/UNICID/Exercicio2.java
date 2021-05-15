package UNICID;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Exercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
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
	public Exercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 36, 84, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 61, 46, 14);
		contentPane.add(lblSexo);
		
		JLabel lblEstadoCvil = new JLabel("Estado C\u00EDvil:");
		lblEstadoCvil.setBounds(10, 86, 84, 14);
		contentPane.add(lblEstadoCvil);
		
		txtNome = new JTextField();
		txtNome.setBounds(230, 8, 194, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(230, 33, 194, 20);
		contentPane.add(txtEndereco);
		
		JComboBox cmbSexo = new JComboBox();
		cmbSexo.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma op\u00E7\u00E3o", "Feminino", "Masculino"}));
		cmbSexo.setBounds(230, 58, 194, 20);
		contentPane.add(cmbSexo);
		
		JComboBox cmbEstadoCivil = new JComboBox();
		cmbEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma op\u00E7\u00E3o", "Solteiro(a)", "Casado(a)", "Vi\u00FAvo(a)"}));
		cmbEstadoCivil.setBounds(230, 83, 194, 20);
		contentPane.add(cmbEstadoCivil);
		
		TextArea txtResultado = new TextArea();
		txtResultado.setBounds(10, 173, 414, 137);
		contentPane.add(txtResultado);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNome.setText(null);
				txtEndereco.setText(null);
				cmbSexo.setSelectedIndex(0);
				cmbEstadoCivil.setSelectedIndex(0);
				txtResultado.setText(" ");

			}
		});
		btnLimpar.setBounds(230, 114, 194, 23);
		contentPane.add(btnLimpar);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.append(txtNome.getText() + "\n");
				txtResultado.append(txtEndereco.getText() + "\n");
				txtResultado.append(cmbSexo.getSelectedItem() + "\n");
				txtResultado.append(cmbEstadoCivil.getSelectedItem() + "\n");
			}
		});
		btnMostrar.setBounds(10, 114, 210, 23);
		contentPane.add(btnMostrar);
	}

}
