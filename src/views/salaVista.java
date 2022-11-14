package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class salaVista extends JFrame implements ActionListener {

	public JPanel contentPane;
	private JPanel contenedorCentral;
	public JPanel panelSuperior;
	public JLabel lblTitulo;
	public JPanel panelInferiror;
	public JButton btnregistrar;
	public int nFilas = 13, nColumnas = 16;
	public int ejex = 20, ejey = 20, largoBtn = 140, anchoBtn = 60;

	public JButton[][] JMatrizBotones = new JButton[nFilas][nColumnas];
	private JButton btnConfiteria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					salaVista frame = new salaVista();
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
	public salaVista() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 984, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		crearPanelSuperiro();
		crearPanelInferior();
		panelCentral();
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

	}

	public void panelCentral() {
		
		Font fuenteLetra = new Font("Arial",Font.BOLD,12);
		contenedorCentral=new JPanel();
		contenedorCentral.setBackground(new Color(0, 0, 0));
		contenedorCentral.setLayout(new GridLayout(nFilas, nColumnas));
		JMatrizBotones = new JButton[nFilas][nColumnas];
		int aux = 1;
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nColumnas; j++) {
				JMatrizBotones[i][j] = new JButton();
				JMatrizBotones[i][j] .setText("" + (char) (i + 'A') + aux) ;
				JMatrizBotones[i][j].setBounds(ejex, ejey, largoBtn, anchoBtn);
				JMatrizBotones[i][j].setFont(fuenteLetra);
				
				JMatrizBotones[i][j].addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						registroView registro = new registroView();
						registro.setVisible(true);
						
					}
				});
				//JMatrizBotones[i][j].setBackground(Color.red); pinta de rojo un boton 
				contenedorCentral.add(JMatrizBotones[i][j]);
				aux++;
			
			}aux=1;
			
			
		}
		
		
		
		getContentPane().add(contenedorCentral, BorderLayout.CENTER);

	}

	public void crearPanelSuperiro() {
		panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(255, 255, 255));
		contentPane.add(panelSuperior, BorderLayout.NORTH);

		lblTitulo = new JLabel("Sala 01");
		lblTitulo.setFont(new Font("Calibri", Font.PLAIN, 30));
		panelSuperior.add(lblTitulo);

	}

	

	public void crearPanelInferior() {
		panelInferiror = new JPanel();
		panelInferiror.setBackground(new Color(255, 255, 255));
		contentPane.add(panelInferiror, BorderLayout.SOUTH);
		{
			btnConfiteria = new JButton("Confiteria");
			panelInferiror.add(btnConfiteria);
			this.btnConfiteria.addActionListener(this);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnConfiteria){
			Confiteria confiteria = new Confiteria();
			confiteria.setVisible(true);
		}
		
	}
	
	
	

}
