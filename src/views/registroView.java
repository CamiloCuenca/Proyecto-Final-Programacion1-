package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class registroView extends JFrame {

	public JPanel contentPane;
	public JPanel panelSuperior;
	private JPanel panelCentral;
	private JPanel panelInferiro;
	private JButton btnAceptar;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registroView frame = new registroView();
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
	public registroView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		crearPanelSuperior();
		crearPanelCentral();
		crearPanleInferiro();
		
	}
	
	public void crearPanelSuperior() {
		panelSuperior = new JPanel();
		contentPane.add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Registro Cliente");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
		panelSuperior.add(lblNewLabel);
		
		
		
		
	}
	
	public void  crearPanelCentral() {
		panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		{
			lblNewLabel_1 = new JLabel("Nombre Completo");
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
			lblNewLabel_1.setBounds(57, 58, 107, 14);
			panelCentral.add(lblNewLabel_1);
		}
		
		textField = new JTextField();
		textField.setBounds(202, 55, 191, 20);
		panelCentral.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Documento de identidad");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(57, 98, 135, 14);
		panelCentral.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(202, 95, 191, 20);
		panelCentral.add(textField_1);
		textField_1.setColumns(10);
		
	}
	
	public void crearPanleInferiro() {
		panelInferiro = new JPanel();
		contentPane.add(panelInferiro, BorderLayout.SOUTH);
		{
			btnAceptar = new JButton("ACEPTAR");
			panelInferiro.add(btnAceptar);
		}
	}
}
