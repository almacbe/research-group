package ResearchGroup;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class CreateResearchGroup extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel jPanelNorth = null;

	private JPanel jPanelSouth = null;

	private JPanel jPanelCenter = null;

	private JLabel jLabelNombre = null;

	private JTextField jTextFieldNombre = null;

	private JLabel jLabelLineas = null;

	private JTextArea jTextAreaLineasDeInvestigacion = null;

	private JButton jButtonAnyadir = null;

	/**
	 * This is the default constructor
	 */
	public CreateResearchGroup() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("Crear grupo de investigación");
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
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.BOTH;
			gridBagConstraints.weightx = 1.0;
			jLabelNombre = new JLabel();
			jLabelNombre.setText("Nombre del Grupo");
			jPanelNorth = new JPanel();
			jPanelNorth.setLayout(new GridBagLayout());
			jPanelNorth.add(jLabelNombre, new GridBagConstraints());
			jPanelNorth.add(getJTextFieldNombre(), gridBagConstraints);
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
			jPanelSouth.add(getJButtonAnyadir(), new GridBagConstraints());
		}
		return jPanelSouth;
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
			gridBagConstraints1.weighty = 1.0;
			gridBagConstraints1.weightx = 1.0;
			jLabelLineas = new JLabel();
			jLabelLineas.setText("L’neas de Investigaci—n");
			jPanelCenter = new JPanel();
			jPanelCenter.setLayout(new GridBagLayout());
			jPanelCenter.add(jLabelLineas, new GridBagConstraints());
			jPanelCenter.add(getJTextAreaLineasDeInvestigacion(), gridBagConstraints1);
		}
		return jPanelCenter;
	}

	/**
	 * This method initializes jTextFieldNombre	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNombre() {
		if (jTextFieldNombre == null) {
			jTextFieldNombre = new JTextField();
		}
		return jTextFieldNombre;
	}

	/**
	 * This method initializes jTextAreaLineasDeInvestigacion	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextAreaLineasDeInvestigacion() {
		if (jTextAreaLineasDeInvestigacion == null) {
			jTextAreaLineasDeInvestigacion = new JTextArea();
		}
		return jTextAreaLineasDeInvestigacion;
	}

	/**
	 * This method initializes jButtonAnyadir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAnyadir() {
		if (jButtonAnyadir == null) {
			jButtonAnyadir = new JButton();
			jButtonAnyadir.setText("A–adir");
			jButtonAnyadir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//Recoger la informaci—n del nombre y las lineas de investigacion
					//y a–adirlo a la base de datos
				}
			});
		}
		return jButtonAnyadir;
	}

}
