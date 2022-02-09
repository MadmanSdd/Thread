package pilhaTread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame{
	
	//Components
	JPanel jpanel = new JPanel(new GridBagLayout());
	
	private JLabel jlabelOne = new  JLabel("Email");
	private JTextField jtextOne = new JTextField();
	private JButton jbttEnviar = new JButton("Enviar");
	private JButton jbttStop = new JButton("Stop");
	
	public static void main(String[] args) {
		new Main();
	}
	
	private Main() {
		setTitle("Pilha Thread");
		setSize(new Dimension(260,180));
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//grid
		GridBagConstraints grid = new GridBagConstraints();
		grid.gridx = 0;
		grid.gridy = 0;
		grid.insets = new Insets(0, 0, 2, 2);
		
		//Add componets
		jlabelOne.setPreferredSize(new Dimension(60,30));
		jpanel.add(jlabelOne,grid);
		 
		jtextOne.setPreferredSize(new Dimension(154,30));
		grid.gridy++;
		jpanel.add(jtextOne,grid);

		jbttEnviar.setPreferredSize(new Dimension(120,30));
		grid.gridy++;
		jpanel.add(jbttEnviar,grid);
		
		jbttStop.setPreferredSize(new Dimension(120,30));
		grid.gridy++;
		jpanel.add(jbttStop,grid);
		
		add(jpanel,BorderLayout.CENTER);
		setVisible(true);
	}
}
