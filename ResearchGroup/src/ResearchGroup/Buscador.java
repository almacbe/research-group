package ResearchGroup;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class Buscador extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel jPanelNorth = null;

	private JPanel jPanelSouth = null;

	private JLabel jLabelBusqueda = null;

	private JTextField jTextFieldBusqueda = null;

	private JButton jButtonBuscar = null;

	private JScrollPane jScrollPaneResultado = null;

	private JList jListResultado = null;

	private int TipoBuscador = -1;		//Grupo == 0
										//Autor == 1

	private JPanel jPanelCenter = null;

	private JButton jButtonOk = null;

	private Object Resultado = null;
	
	/**
	 * This is the default constructor
	 */
	public Buscador() {
		super();
		initialize();
		jLabelBusqueda.setText("Algo: ");
		jTextFieldBusqueda.setText("Introduzca algo...");
	}
	
	//Constructor para diferenciar entre la busqueda de grupo y nombre
	public Buscador(int i){
		super();
		initialize();
		TipoBuscador = i;
		if( TipoBuscador == 0){
			jLabelBusqueda.setText("Grupo: ");
			jTextFieldBusqueda.setText("Introduzca nombre del grupo...");
		}
		else if( TipoBuscador == 1){
			jLabelBusqueda.setText("Autor: ");
			jTextFieldBusqueda.setText("Intrudca nombre del autor...");
		}
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(500, 300);
		this.setContentPane(getJContentPane());
		this.setTitle("Buscar ...");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJPanelNorth(), BorderLayout.NORTH);
			jContentPane.add(getJPanelSouth(), BorderLayout.SOUTH);
			jContentPane.add(getJPanelCenter(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanelNorth	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelNorth() {
		if (jPanelNorth == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.fill = GridBagConstraints.HORIZONTAL;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.BOTH;
			gridBagConstraints.weightx = 1.0;
			jLabelBusqueda = new JLabel();
			jLabelBusqueda.setText("");
			jPanelNorth = new JPanel();
			jPanelNorth.setLayout(new GridBagLayout());
			jPanelNorth.add(jLabelBusqueda, gridBagConstraints2);
			jPanelNorth.add(getJTextFieldBusqueda(), gridBagConstraints);
			jPanelNorth.add(getJButtonBuscar(), new GridBagConstraints());
		}
		return jPanelNorth;
	}

	/**
	 * This method initializes jPanelSouth	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelSouth() {
		if (jPanelSouth == null) {
			jPanelSouth = new JPanel();
			jPanelSouth.setLayout(new GridBagLayout());
			jPanelSouth.add(getJButtonOk(), new GridBagConstraints());
		}
		return jPanelSouth;
	}

	/**
	 * This method initializes jTextFieldBusqueda	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldBusqueda() {
		if (jTextFieldBusqueda == null) {
			jTextFieldBusqueda = new JTextField();
		}
		return jTextFieldBusqueda;
	}

	/**
	 * This method initializes jButtonBuscar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBuscar() {
		if (jButtonBuscar == null) {
			jButtonBuscar = new JButton();
			jButtonBuscar.setText("Buscar");
			jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(TipoBuscador == 0){
						//Resultado = BuscarGrupo();
					}
					else if(TipoBuscador == 1){
						//Resultado = BuscarAutor();
					}
					
					//Rellenar la jList
				}
			});
		}
		return jButtonBuscar;
	}

	/**
	 * This method initializes jScrollPaneResultado	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneResultado() {
		if (jScrollPaneResultado == null) {
			jScrollPaneResultado = new JScrollPane();
			jScrollPaneResultado.setViewportView(getJListResultado());
		}
		return jScrollPaneResultado;
	}

	/**
	 * This method initializes jListResultado	
	 * 	
	 * @return javax.swing.JList	
	 */
	private JList getJListResultado() {
		if (jListResultado == null) {
			jListResultado = new JList();
		}
		return jListResultado;
	}

	/**
	 * This method initializes jPanelCenter	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelCenter() {
		if (jPanelCenter == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.fill = GridBagConstraints.BOTH;
			gridBagConstraints1.gridy = -1;
			gridBagConstraints1.weightx = 1.0;
			gridBagConstraints1.weighty = 1.0;
			gridBagConstraints1.gridx = -1;
			jPanelCenter = new JPanel();
			jPanelCenter.setLayout(new GridBagLayout());
			jPanelCenter.add(getJScrollPaneResultado(), gridBagConstraints1);
		}
		return jPanelCenter;
	}

	/**
	 * This method initializes jButtonOk	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonOk() {
		if (jButtonOk == null) {
			jButtonOk = new JButton();
			jButtonOk.setText("OK");
		}
		return jButtonOk;
	}

}
