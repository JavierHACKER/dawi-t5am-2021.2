package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Producto;
import modelo.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class FrmManteProd extends JFrame {

	private JPanel contentPane;
	
	private JTextArea txtSalida;
	private JTextField txtCodigo;
	JComboBox cboCategorias;
	private JTextField txtNombre;
	private JTextField txtStock;
	private JTextField txtPrecio;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmManteProd frame = new FrmManteProd();
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
	public FrmManteProd() {
		setTitle("MANTENIMIENTO DE PRODUCTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				registrar();
			}
		});
		btnNewButton.setBounds(324, 29, 89, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 171, 414, 143);
		contentPane.add(scrollPane);
		
		txtSalida = new JTextArea();
		scrollPane.setViewportView(txtSalida);
		
		JButton btnListado = new JButton("Listado");
		btnListado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listado();
			}
		});
		btnListado.setBounds(177, 322, 89, 23);
		contentPane.add(btnListado);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(122, 8, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id. Producto :");
		lblNewLabel.setBounds(10, 11, 102, 14);
		contentPane.add(lblNewLabel);
		
		cboCategorias = new JComboBox();
		cboCategorias.setBounds(122, 54, 86, 22);
		contentPane.add(cboCategorias);
		
		JLabel lblCategora = new JLabel("Categor\u00EDa");
		lblCategora.setBounds(10, 58, 102, 14);
		contentPane.add(lblCategora);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Producto");
		lblNewLabel_1.setBounds(10, 33, 102, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(122, 30, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Stock");
		lblNewLabel_2.setBounds(10, 92, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		txtStock = new JTextField();
		txtStock.setBounds(122, 87, 86, 20);
		contentPane.add(txtStock);
		txtStock.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Precio");
		lblNewLabel_3.setBounds(10, 127, 71, 14);
		contentPane.add(lblNewLabel_3);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(122, 124, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
	}

	void llenacombo() {
		
	}
	
	void listado() {
		
	}
	
	void registrar() {
		

	}
}
