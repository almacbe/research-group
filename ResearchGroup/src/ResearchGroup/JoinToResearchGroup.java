package ResearchGroup;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JoinToResearchGroup extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel jPanelNorth = null;

	private JPanel jPanelCenter = null;

	private JLabel jLabelNombre = null;

	private JTextField jTextFieldNombre = null;

	private JLabel jLabelGrupo = null;

	private JTextField jTextFieldGrupo = null;

	private JButton jButtonBuscarNombre = null;

	private JButton jButtonBuscarGrupo = null;

	private JButton jButtonUnir = null;

	/**
	 * This is the default constructor
	 */
	public JoinToResearchGroup() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 140);
		this.setContentPane(getJContentPane());
		this.setTitle("Unir a Grupo de Investigacion");
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
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 2;
			gridBagConstraints3.gridy = 1;
			GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
			gridBagConstraints21.gridx = 2;
			gridBagConstraints21.gridy = 0;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.fill = GridBagConstraints.BOTH;
			gridBagConstraints2.gridy = 1;
			gridBagConstraints2.weightx = 1.0;
			gridBagConstraints2.gridx = 1;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.gridy = 1;
			jLabelGrupo = new JLabel();
			jLabelGrupo.setText("Grupo: ");
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.BOTH;
			gridBagConstraints.weightx = 1.0;
			jLabelNombre = new JLabel();
			jLabelNombre.setText("Nombre: ");
			jPanelNorth = new JPanel();
			jPanelNorth.setLayout(new GridBagLayout());
			jPanelNorth.add(jLabelNombre, new GridBagConstraints());
			jPanelNorth.add(getJTextFieldNombre(), gridBagConstraints);
			jPanelNorth.add(jLabelGrupo, gridBagConstraints1);
			jPanelNorth.add(getJTextFieldGrupo(), gridBagConstraints2);
			jPanelNorth.add(getJButtonBuscarNombre(), gridBagConstraints21);
			jPanelNorth.add(getJButtonBuscarGrupo(), gridBagConstraints3);
		}
		return jPanelNorth;
	}

	/**
	 * This method initializes jPanelCenter	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelCenter() {
		if (jPanelCenter == null) {
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridx = 0;
			gridBagConstraints4.gridy = 0;
			jPanelCenter = new JPanel();
			jPanelCenter.setLayout(new GridBagLayout());
			jPanelCenter.add(getJButtonUnir(), gridBagConstraints4);
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
	 * This method initializes jTextFieldGrupo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldGrupo() {
		if (jTextFieldGrupo == null) {
			jTextFieldGrupo = new JTextField();
		}
		return jTextFieldGrupo;
	}

	/**
	 * This method initializes jButtonBuscarNombre	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBuscarNombre() {
		if (jButtonBuscarNombre == null) {
			jButtonBuscarNombre = new JButton();
			jButtonBuscarNombre.setText("B. Autor");
			jButtonBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Buscador v = new Buscador(1);
					v.setVisible(true);
				}
			});
		}
		return jButtonBuscarNombre;
	}

	/**
	 * This method initializes jButtonBuscarGrupo	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBuscarGrupo() {
		if (jButtonBuscarGrupo == null) {
			jButtonBuscarGrupo = new JButton();
			jButtonBuscarGrupo.setText("B. Grupo");
			jButtonBuscarGrupo.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Buscador v = new Buscador(0);
					v.setVisible(true);
				}
			});
		}
		return jButtonBuscarGrupo;
	}

	/**
	 * This method initializes jButtonUnir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonUnir() {
		if (jButtonUnir == null) {
			jButtonUnir = new JButton();
			jButtonUnir.setText("OK");
			jButtonUnir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					//Recoger la informaci—n de los campos y llamar a la capa negocio
					//para que asgine el Investigador al Grupo
				}
			});
		}
		return jButtonUnir;
	}

}
