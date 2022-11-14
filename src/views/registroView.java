package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.ls.LSInput;

import model.registroUsusario;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Color;


public class registroView extends JFrame implements ActionListener {

	public JPanel contentPane;
	public JPanel panelSuperior;
	private JPanel panelCentral;
	private JPanel panelInferiro;
	private JButton btnAceptar;
	private JLabel lblNewLabel_1;
	private JTextField textNombre;
	private JTextField textCedula;
	private ArrayList<String> listaNombres= new registroUsusario().llenarUsusarios("Nombres: ");
	private ArrayList<String> listaCedulas = new registroUsusario().llenarCedulaususarios("Documentos: ");
	private JButton btnCancelar;
	private ImageIcon imagen;
	private JLabel label;

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
		setBounds(100, 100, 574, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		crearPanelSuperior();
		crearPanelCentral();
		crearPanleInferiro();
		setimagenLabel(label,"src/Imagenes/userIcono.png");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		
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
			lblNewLabel_1.setBounds(209, 58, 107, 14);
			panelCentral.add(lblNewLabel_1);
		}
		
		textNombre = new JTextField();
		textNombre.setBounds(326, 55, 191, 20);
		panelCentral.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Documento de identidad");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(177, 98, 135, 14);
		panelCentral.add(lblNewLabel_2);
		
		textCedula = new JTextField();
		textCedula.setBounds(326, 95, 191, 20);
		panelCentral.add(textCedula);
		textCedula.setColumns(10);
		
		label = new JLabel("");
		label.setBackground(new Color(255, 255, 255));
		label.setAlignmentX(Label.CENTER);
		label.setBounds(50, 32, 117, 133);
		panelCentral.add(label);
			
	}
	
	public void setimagenLabel(JLabel label,String root) {
		imagen = new ImageIcon(root);
		Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
		label.setIcon(icon);
		this.repaint();
		
	}
	
	public void crearPanleInferiro() {
		panelInferiro = new JPanel();
		
		
		btnAceptar= new JButton("Aceptar");
		this.btnAceptar.addActionListener(this);
	
		btnCancelar = new JButton("Cancelar");
		this.btnCancelar.addActionListener(this);
		
		panelInferiro.add(btnAceptar);
		panelInferiro.add(btnCancelar);
		
		contentPane.add(panelInferiro, BorderLayout.SOUTH);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnAceptar) {
			this.setVisible(false);
			if(textNombre.getText().equals("")&& textCedula.getText().equals("")) {
				
				JOptionPane.showMessageDialog(null, "Por favor llene los campos requeridos");
			}else {
				
				String nombre = textNombre.getText();// se captura el nombre del ususario
				String cedula=textCedula.getText();// se captura el nombre del ususario
				
				
				listaNombres.add(nombre);//Se guarda el nombre del ususario en la lsita de ususarios
				System.out.println(listaNombres);
				

				listaCedulas.add(cedula);// se guarda la cedula del ususraio en la ista de los documentos de los ususarios	
				System.out.println(listaCedulas);
			
				}
			
		}else if (e.getSource()==btnCancelar) {
			//Se debve cerrar la ventana 
			
		}
		
	}
}
